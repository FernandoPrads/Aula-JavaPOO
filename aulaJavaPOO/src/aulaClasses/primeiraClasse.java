package aulaClasses;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aulaClasses.Aluno;
import cursojava.constantes.StatusAluno;

public class primeiraClasse {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/* new Aluno() � uma instancia (cria��o de Objetos) */
			/* aluno1 � uma referencia para o objeto aluno */

			/* entrada de dados pelo teclado */
			String nome = JOptionPane.showInputDialog("Qual o seu nome do aluno " + qtd + " ?");
			/*
			 * String idade1 = JOptionPane.showInputDialog("Qual a sua idade?"); String
			 * dataNascimento1 = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String rg = JOptionPane.showInputDialog("Registro geral"); String cpf =
			 * JOptionPane.showInputDialog("Qual o cpf"); String mae =
			 * JOptionPane.showInputDialog("Nome da m�e"); String pai =
			 * JOptionPane.showInputDialog("Nome do Pai"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula"); String serie =
			 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome); /*
									 * aluno1.setDataMatricula(matricula);
									 * aluno1.setDataNascimento(dataNascimento1);
									 * aluno1.setIdade(Integer.valueOf(idade1)); aluno1.setNomeEscola(escola);
									 * aluno1.setNomeMae(mae); aluno1.setNomePai(pai); aluno1.setNumeroCpf(cpf);
									 * aluno1.setRegistroGeral(rg); aluno1.setSerieMatriculado(matricula);
									 * 
									 * 
									 /* para adicionar disciplinas*/
									  
									   for (int pos = 1; pos <= 1; pos++) { String
									  
									  nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +
									  " ?"); String notaDisciplina =
									  JOptionPane.showInputDialog("Nota do disciplina " + pos + " ?");
									 
									  Disciplina disciplina = new Disciplina();
									  disciplina.setDisciplina(nomeDisciplina);
									  disciplina.setNota(Double.valueOf(notaDisciplina));
									  
									  aluno1.getDisciplinas().add(disciplina); 
									  }
									 
									  /* para remover disciplinas*/
									 
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

		/* correr lista pelo nome e retira da lista */

		/*
		 * for (Aluno aluno : alunos) {
		 * 
		 * /*if (aluno.getNome().equalsIgnoreCase("Gui")) { alunos.remove(aluno); break;
		 * } else { /*System.out.println(aluno.getNome()); /* Descri��o do objeto na
		 * memoria
		 */
		/*
		 * System.out.println("A m�dia da nota �: " + aluno.getMediaNota());
		 * System.out.println("Resultado: " + (aluno.getAlunoAprovado2()));
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * 
		 * }
		 * 
		 * // }
		 * 
		 * /* imprime os alunos que sobraram
		 */

		/*
		 * for (Aluno aluno1 : alunos) {
		 * System.out.println("Alunos que sobraram da lista");
		 * System.out.println(aluno.getNome());
		 * System.out.println("Suas materias s�o ");
		 * 
		 * for (Disciplina disciplina : aluno.getDisciplinas()) {
		 * System.out.println(disciplina.getDisciplina()); } }
		 * 
		 * /* percorrer lista por disciplinas e por posi��o da nota
		 */
		/*
		 * for (int pos = 0; pos < alunos.size(); pos++) {
		 * 
		 * Aluno aluno1 = alunos.get(pos);
		 * 
		 * /*trocar aluno da lista
		 */
		/*
		 * if (aluno.getNome().equalsIgnoreCase("Gui")) { Aluno trocar = new Aluno();
		 * trocar.setNome("Aluno trocado");
		 * 
		 * Disciplina disciplina = new Disciplina();
		 * disciplina.setDisciplina("Matematica"); disciplina.setNota(96);
		 * 
		 * trocar.getDisciplinas().add(disciplina);
		 * 
		 * alunos.set(pos, trocar); aluno = alunos.get(pos); }
		 * 
		 * System.out.println("Aluno = " + aluno.getNome());
		 * System.out.println("M�dia do aluno = " + aluno.getMediaNota());
		 * System.out.println("Resultado = " + aluno.getAlunoAprovado2());
		 * System.out.println("----------------------------------------------------");
		 * 
		 * for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
		 * 
		 * Disciplina disc = aluno.getDisciplinas().get(posd);
		 * System.out.println("Materia: " + disc.getDisciplina() + " Nota " +
		 * disc.getNota()); } }
		 * 
		 * }
		 */

		
		/*listas Aprovados/Recupera��o/Reprovados*/
		for (Aluno aluno : alunos) {/*listas estaticas*/
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("----------Lista dos aprovados----------");
		for(Aluno aluno : alunosAprovados) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2() + " com m�dia de: " + aluno.getMediaNota());
		}
		
		System.out.println("----------Lista dos recupera��o----------");
		for(Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2() + " com m�dia de: " + aluno.getMediaNota());
		}	
		
		System.out.println("----------Lista dos reprovados----------");
		for(Aluno aluno : alunosReprovados) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2() + " com m�dia de: " + aluno.getMediaNota());
			
		}
		
		
		
	}

}
