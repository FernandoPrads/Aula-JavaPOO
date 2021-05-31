package cursojava.executavel;

import javax.print.attribute.standard.Media;
import javax.swing.JOptionPane;

import aulaClasses.Aluno;
import aulaClasses.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		/* Array pode ser de toodos os tipos de dados e objetos tambem */

		/* Array sempre deve ter a quantidade de posições definidas */
		

		/*
		 * Array Simples /*atribuir valor nas posições do arrays
		 * 
		 * double notas[] = new double[5];
		 * 
		 * notas[0] = 7.8; 
		 * notas[1] = 8.7;
		 * notas[2] = 9.7; 
		 * notas[3] = 9.9;
		 */

		/*
		 * imprime os valores do array
		 *  for (int pos = 0; pos < 5; pos++) {
		 * System.out.println("Nota " + (pos+1) + " é:" + notas[pos]); }
		 */
		
		

		
		

		/*Array de forma dinamica*/
		/*String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição: " + pos);
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é: " + notas[pos]);

		}*/
		
		
		
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasHtml = {7.1,5.7,9.6,7.8};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Fernando Luiz");
		aluno.setNomeEscola("Uninove");
		
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Html");
		disciplina2.setNota(notasHtml);
		aluno.getDisciplinas().add(disciplina2);
		
	//-------------------------------------------------------------------------------------------------
		
		 
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é " + arrayAlunos[pos].getNome() );
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota++ ) {
					 System.out.println("A nota " + posnota + " é: " + d.getNota()[posnota]);
				}
			}
		}
		
		
		
		
		
		
		
	
	}
}
