package aulaClasses;

import javax.swing.JOptionPane;

import aulaClasses.Aluno;

public class primeiraClasee {

	public static void main(String[] args) {

		/* new Aluno() é uma instancia (criação de Objetos) */
		/* aluno1 é uma referencia para o objeto aluno */
		
		/*entrada de dados pelo teclado*/
		String nome1 = JOptionPane.showInputDialog("Qual o seu nome?");
		String idade1 = JOptionPane.showInputDialog("Qual a sua idade?");
		String dataNascimento1 = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro geral");
		String cpf = JOptionPane.showInputDialog("Qual o cpf");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina1");
		String note1 = JOptionPane.showInputDialog("Nota 1");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina2");
        String note2 = JOptionPane.showInputDialog("Nota 2");
        String disciplina3 = JOptionPane.showInputDialog("Disciplina3");
		String note3 = JOptionPane.showInputDialog("Nota 3");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina4");
		String note4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setDataMatricula(matricula);
		aluno1.setDataNascimento(dataNascimento1);
		aluno1.setIdade(Integer.valueOf(idade1));
		aluno1.setNome(nome1);
		aluno1.setNomeEscola(escola);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNumeroCpf(cpf);
		aluno1.setRegistroGeral(rg);
		aluno1.setSerieMatriculado(matricula);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(note1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(note2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(note3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(note4));
		
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println(aluno1); /*Descrição do objeto na memoria*/
	

   		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nascido em: " + aluno1.getDataNascimento());
		System.out.println("A média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		System.out.println("----------------------------------------------------------------");
		
		/*Aluno aluno2 = new Aluno();
		aluno2.setDataMatricula("30/05/2020");
		aluno2.setDataNascimento("29/12/2017");
		aluno2.setIdade(3);
		aluno2.setNome("Noah");
		aluno2.setNomeEscola("Casa");
		aluno2.setNomeMae("Barbara");
		aluno2.setNomePai("Fernando");
		aluno2.setNumeroCpf("333.276.333.96");
		aluno2.setRegistroGeral("6562");
		aluno2.setSerieMatriculado("parquinho");
		aluno2.getDisciplina().setNota1(Double.parseDouble(note1));
		aluno2.getDisciplina().setNota2(Double.parseDouble(note2));
		aluno2.getDisciplina().setNota3(Double.parseDouble(note3));
		aluno2.getDisciplina().setNota4(Double.parseDouble(note4));
		
		System.out.println("Nome é: " + aluno2.getNome());
		System.out.println("Idade é: " + aluno2.getIdade());
		System.out.println("Nascido em: " + aluno2.getDataNascimento());
		System.out.println("A média da nota é: " + aluno2.getMediaNota());
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		/*System.out.println("----------------------------------------------------------------");

		
		Aluno aluno3 = new Aluno();
		aluno3.setDataMatricula("15/04/2021");
		aluno3.setDataNascimento("02/08/1988");
		aluno3.setIdade(33);
		aluno3.setNome("Barbara");
		aluno3.setNomeEscola("Casa");
		aluno3.setNomeMae("Aurea");
		aluno3.setNomePai("Luiz");
		aluno3.setNumeroCpf("333.276.333.9");
		aluno3.setRegistroGeral("6549");
		aluno3.setSerieMatriculado("3o ano");
		aluno3.getDisciplina().setNota1(Double.parseDouble(note1));
		aluno3.getDisciplina().setNota2(Double.parseDouble(note2));
		aluno3.getDisciplina().setNota3(Double.parseDouble(note3));
		aluno3.getDisciplina().setNota4(Double.parseDouble(note4));

		System.out.println("Nome é: " + aluno3.getNome());
		System.out.println("Idade é: " + aluno3.getIdade());
		System.out.println("Nascido em: " + aluno3.getDataNascimento());
		System.out.println("A média da nota é: " + aluno3.getMediaNota());
		System.out.println("Resultado: " + (aluno3.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		/*System.out.println("----------------------------------------------------------------");
	
		Aluno aluno4 = new Aluno();
		aluno4.setDataMatricula("30/05/2020");
		aluno4.setDataNascimento("13/03/1983");
		aluno4.setIdade(38);
		aluno4.setNome("Fernando");
		aluno4.setNomeEscola("Uninove");
		aluno4.setNomeMae("Cosima");
		aluno4.setNomePai("Luiz");
		aluno4.setNumeroCpf("698.457.127.96");
		aluno4.setRegistroGeral("6522");
		aluno4.setSerieMatriculado("2o semestre");
		aluno4.getDisciplina().setNota1(Double.parseDouble(note1));
		aluno4.getDisciplina().setNota2(Double.parseDouble(note2));
		aluno4.getDisciplina().setNota3(Double.parseDouble(note3));
		aluno4.getDisciplina().setNota4(Double.parseDouble(note4));
		
		System.out.println("Nome é: " + aluno4.getNome());
		System.out.println("Idade é: " + aluno4.getIdade());
		System.out.println("Nascido em: " + aluno4.getDataNascimento());
		System.out.println("A média da nota é: " + aluno4.getMediaNota());
		System.out.println("Resultado: " + (aluno4.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		/*System.out.println("----------------------------------------------------------------");
		
/*EQUALS and HASHCODE (Diferenciar e comparar objetos)*/
	/*if (aluno2.equals(aluno3)) {
		System.out.println("Alunos são iguais");
	}else {
		System.out.println("Alunos não são iguais");*/
	}
		
	}
	
	
	

