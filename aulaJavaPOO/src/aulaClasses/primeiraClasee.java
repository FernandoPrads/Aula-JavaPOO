package aulaClasses;

import javax.swing.JOptionPane;

import aulaClasses.Aluno;

public class primeiraClasee {

	public static void main(String[] args) {

		/* new Aluno() é uma instancia (criação de Objetos) */
		/* aluno1 é uma referencia para o objeto aluno */
		
		/*entrada de dados pelo teclado*/
		String nome1 = JOptionPane.showInputDialog("Qual o seu nome?");
		/*String idade1 = JOptionPane.showInputDialog("Qual a sua idade?");
		String dataNascimento1 = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro geral");
		String cpf = JOptionPane.showInputDialog("Qual o cpf");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Nome da escola");*/
		
		
		Aluno aluno1 = new Aluno();
		
		/*aluno1.setNome(nome1);
		aluno1.setDataMatricula(matricula);
		aluno1.setDataNascimento(dataNascimento1);
		aluno1.setIdade(Integer.valueOf(idade1));
		aluno1.setNomeEscola(escola);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNumeroCpf(cpf);
		aluno1.setRegistroGeral(rg);
		aluno1.setSerieMatriculado(matricula);*/
		
		/*para adicionar disciplinas*/
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota do disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/*para remover disciplinas*/
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina?");
		
		if (escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
				while (continuarRemover ==0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null,"Continuar a remover?");
			}
			
			
		}
		
		
		System.out.println(aluno1); /*Descrição do objeto na memoria*/
   		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nascido em: " + aluno1.getDataNascimento());
		System.out.println("A média da nota é: " + aluno1.getMediaNota());
		/*System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));*/
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado2()));
		
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		
		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Java POO");
		disciplina3.setNota(97);
		
		
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);




		
		
		
		
	}
		
	}
	
	
	

