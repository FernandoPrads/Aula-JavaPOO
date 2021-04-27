package aulaClasses;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aulaClasses.Aluno;

public class primeiraClasse {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new Aluno() é uma instancia (criação de Objetos) */
			/* aluno1 é uma referencia para o objeto aluno */

			/* entrada de dados pelo teclado */
			String nome = JOptionPane.showInputDialog("Qual o seu nome do aluno " + qtd + " ?");
			/*
			 * String idade1 = JOptionPane.showInputDialog("Qual a sua idade?"); String
			 * dataNascimento1 = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String rg = JOptionPane.showInputDialog("Registro geral"); String cpf =
			 * JOptionPane.showInputDialog("Qual o cpf"); String mae =
			 * JOptionPane.showInputDialog("Nome da mãe"); String pai =
			 * JOptionPane.showInputDialog("Nome do Pai"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula"); String serie =
			 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola");
			 */

			Aluno aluno1 = new Aluno();

			/*
			 * aluno1.setNome(nome1); aluno1.setDataMatricula(matricula);
			 * aluno1.setDataNascimento(dataNascimento1);
			 * aluno1.setIdade(Integer.valueOf(idade1)); aluno1.setNomeEscola(escola);
			 * aluno1.setNomeMae(mae); aluno1.setNomePai(pai); aluno1.setNumeroCpf(cpf);
			 * aluno1.setRegistroGeral(rg); aluno1.setSerieMatriculado(matricula);
			 */

			/* para adicionar disciplinas */
			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota do disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			/* para remover disciplinas */
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("Gui")) {

				System.out.println(aluno); /* Descrição do objeto na memoria */
				System.out.println("A média da nota é: " + aluno.getMediaNota());
				System.out.println("Resultado: " + (aluno.getAlunoAprovado2()));
				System.out.println("-------------------------------------------------------------");
				break;
			}

		}

	}

}
