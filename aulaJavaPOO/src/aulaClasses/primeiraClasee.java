package aulaClasses;

import javax.swing.JOptionPane;

import aulaClasses.Aluno;

public class primeiraClasee {

	public static void main(String[] args) {

		/* new Aluno() é uma instancia (criação de Objetos) */
		/* aluno1 é uma referencia para o objeto aluno */
		
		String nome1 = JOptionPane.showInputDialog("Qual o seu nome?");
		String idade1 = JOptionPane.showInputDialog("Qual a sua idade?");
		String dataNascimento1 = JOptionPane.showInputDialog("Qual a data de nascimento?");
		
			
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setDataMatricula("30/03/2020");
		aluno1.setDataNascimento(dataNascimento1);
		aluno1.setIdade(Integer.valueOf(idade1));
		aluno1.setNome(nome1);
		aluno1.setNomeEscola("ETEC");
		aluno1.setNomeMae("Barbara");
		aluno1.setNomePai("Fernando");
		aluno1.setNumeroCpf("333.256.264.96");
		aluno1.setRegistroGeral("6599");
		aluno1.setSerieMatriculado("2o ano");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println(aluno1); /*Descrição do objeto na memoria*/
	

		System.out.println("Nome é: " + aluno1.getNome());
		System.out.println("Idade é: " + aluno1.getIdade());
		System.out.println("Nascido em: " + aluno1.getDataNascimento());
		System.out.println("A média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		System.out.println("----------------------------------------------------------------");

		/*String idade2 = JOptionPane.showInputDialog("Qual a sua idade?");
		String nome2 = JOptionPane.showInputDialog("Qual o seu nome?");
		String dataNascimento2 = JOptionPane.showInputDialog("Qual a data de nascimento?");
		
		Aluno aluno2 = new Aluno();
		aluno2.setDataMatricula("30/05/2020");
		aluno2.setDataNascimento(dataNascimento2);
		aluno2.setIdade(Integer.valueOf(idade2));
		aluno2.setNome(nome2);
		aluno2.setNomeEscola("Casa");
		aluno2.setNomeMae("Barbara");
		aluno2.setNomePai("Fernando");
		aluno2.setNumeroCpf("333.276.333.96");
		aluno2.setRegistroGeral("6562");
		aluno2.setSerieMatriculado("parquinho");
		aluno2.setNota1(90);
		aluno2.setNota2(79.5);
		aluno2.setNota3(69.8);
		aluno2.setNota4(89.8);

		System.out.println("Nome é: " + aluno2.getNome());
		System.out.println("Idade é: " + aluno2.getIdade());
		System.out.println("Nascido em: " + aluno2.getDataNascimento());
		System.out.println("A média da nota é: " + aluno2.getMediaNota());
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		/*System.out.println("----------------------------------------------------------------");

		String idade3 = JOptionPane.showInputDialog("Qual a sua idade?");
		String nome3 = JOptionPane.showInputDialog("Qual o seu nome?");
		String dataNascimento3 = JOptionPane.showInputDialog("Qual a data de nascimento?");
		
		Aluno aluno3 = new Aluno();
		aluno3.setDataMatricula("15/04/2021");
		aluno3.setDataNascimento(dataNascimento3);
		aluno3.setIdade(Integer.valueOf(idade3));
		aluno3.setNome(nome3);
		aluno3.setNomeEscola("Casa");
		aluno3.setNomeMae("Aurea");
		aluno3.setNomePai("Luiz");
		aluno3.setNumeroCpf("362.895.478.69");
		aluno3.setRegistroGeral("6549");
		aluno3.setSerieMatriculado("3o ano");
		aluno3.setNota1(90);
		aluno3.setNota2(99.5);
		aluno3.setNota3(75.9);
		aluno3.setNota4(95.6);

		System.out.println("Nome é: " + aluno3.getNome());
		System.out.println("Idade é: " + aluno3.getIdade());
		System.out.println("Nascido em: " + aluno3.getDataNascimento());
		System.out.println("A média da nota é: " + aluno3.getMediaNota());
		System.out.println("Resultado: " + (aluno3.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		/*System.out.println("----------------------------------------------------------------");

		String idade4 = JOptionPane.showInputDialog("Qual a sua idade?");
		String nome4 = JOptionPane.showInputDialog("Qual o seu nome?");
		String dataNascimento4 = JOptionPane.showInputDialog("Qual a data de nascimento?");
		
		Aluno aluno4 = new Aluno();
		aluno4.setDataMatricula("30/05/2020");
		aluno4.setDataNascimento(dataNascimento4);
		aluno4.setIdade(Integer.valueOf(idade4));
		aluno4.setNome(nome4);
		aluno4.setNomeEscola("Uninove");
		aluno4.setNomeMae("Cosima");
		aluno4.setNomePai("Luiz");
		aluno4.setNumeroCpf("698.457.127.96");
		aluno4.setRegistroGeral("6522");
		aluno4.setSerieMatriculado("2o semestre");
		aluno4.setNota1(90);
		aluno4.setNota2(90.5);
		aluno4.setNota3(75.8);
		aluno4.setNota4(65.8);

		System.out.println("Nome é: " + aluno4.getNome());
		System.out.println("Idade é: " + aluno4.getIdade());
		System.out.println("Nascido em: " + aluno4.getDataNascimento());
		System.out.println("A média da nota é: " + aluno4.getMediaNota());
		System.out.println("Resultado: " + (aluno4.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		/*-----------------------------------------------------------------------------------------*/
		/*System.out.println("----------------------------------------------------------------");*/

	}

}
