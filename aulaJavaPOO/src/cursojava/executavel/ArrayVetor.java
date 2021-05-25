package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

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
		
		

		/* Array pode ser de toodos os tipos de dados e objetos tambem */

		/* Array sempre deve ter a quantidade de posições definidas */
		
		

		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição: " + pos);
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é: " + notas[pos]);

		}
	}
}
