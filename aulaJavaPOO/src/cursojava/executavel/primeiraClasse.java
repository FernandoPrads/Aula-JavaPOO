package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import aulaClasses.Aluno;
import aulaClasses.Disciplina;
import aulaClasses.Secretario;
import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class primeiraClasse {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			/*lerArquivo();     erro gerado para testar o tratamento*/
			
			/*
			 * try { File fil = new File("c://lines.txt"); Scanner scanner = new
			 * Scanner(fil);
			 * 
			 * /*}catch (Exception e) { e.printStackTrace(); throw new
			 * ExcecaoProcessarNota(e.getMessage()); }exemplo de como tratar uma exceção
			 * usando a classe Excecao
			 */

			/* Login e Senha para liberar o programa */
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Secretario(login, senha))
					.autenticar()) { /* se true acessa, se false não acessa */

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * é uma lista que dentro dela tem uma chave que identifica uma sequencia de
				 * valores tambem
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				/* listas Aprovado/Reprovado/Recuperação */
				/*
				 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); List<Aluno>
				 * alunosRecuperacao = new ArrayList<Aluno>(); List<Aluno> alunosReprovados =
				 * new ArrayList<Aluno>();
				 */

				for (int qtd = 1; qtd <= 2; qtd++) {

					/* new Aluno() é uma instancia (criação de Objetos) */
					/* aluno1 é uma referencia para o objeto aluno */

					/* entrada de dados pelo teclado */
					String nome = JOptionPane.showInputDialog("Qual o seu nome do aluno " + qtd + " ?");
					String idade1 = JOptionPane.showInputDialog("Qual a sua idade?");

					/*
					 * String dataNascimento1 =
					 * JOptionPane.showInputDialog("Qual a data de nascimento?"); String rg =
					 * JOptionPane.showInputDialog("Registro geral"); String cpf =
					 * JOptionPane.showInputDialog("Qual o cpf"); String mae =
					 * JOptionPane.showInputDialog("Nome da mãe"); String pai =
					 * JOptionPane.showInputDialog("Nome do Pai"); String matricula =
					 * JOptionPane.showInputDialog("Data da matricula"); String serie =
					 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
					 * JOptionPane.showInputDialog("Nome da escola");
					 */

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade1));

					/*
					 * aluno1.setDataMatricula(matricula);
					 * aluno1.setDataNascimento(dataNascimento1); aluno1.setNomeEscola(escola);
					 * aluno1.setNomeMae(mae); aluno1.setNomePai(pai); aluno1.setNumeroCpf(cpf);
					 * aluno1.setRegistroGeral(rg); aluno1.setSerieMatriculado(matricula);
					 * 
					 * 
					 * /* para adicionar disciplinas
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String

						nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
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

				/* correr lista pelo nome e retira da lista */

				/*
				 * for (Aluno aluno : alunos) {
				 * 
				 * /*if (aluno.getNome().equalsIgnoreCase("Gui")) { alunos.remove(aluno); break;
				 * } else { /*System.out.println(aluno.getNome()); /* Descrição do objeto na
				 * memoria
				 */
				/*
				 * System.out.println("A média da nota é: " + aluno.getMediaNota());
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
				 * 
				 * System.out.println("Alunos que sobraram da lista");
				 * System.out.println(aluno.getNome());
				 * System.out.println("Suas materias são ");
				 * 
				 * for (Disciplina disciplina : aluno.getDisciplinas()) {
				 * System.out.println(disciplina.getDisciplina()); } }
				 * 
				 * /* percorrer lista por disciplinas e por posição da nota
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
				 * System.out.println("Média do aluno = " + aluno.getMediaNota());
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

				/* com Hash Maps */
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {/* listas estaticas */
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);

					}
				}

				/* listas Aprovados/Recuperação/Reprovados */
				/* for (Aluno aluno : alunos) {/* listas estaticas */
				/*
				 * if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				 * alunosAprovados.add(aluno); } else if
				 * (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				 * alunosRecuperacao.add(aluno); } else { alunosReprovados.add(aluno); } }
				 */

				System.out.println("----------Lista dos aprovados----------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado: " + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMediaNota());
				}

				System.out.println("----------Lista dos recuperação----------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado: " + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMediaNota());
				}

				System.out.println("----------Lista dos reprovados----------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado: " + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMediaNota());

				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (Exception e) {/* Captura todas as exceções que não prevemos */

			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); /* Imprime o erro no console Java */

			/* Mensagem do erro ou causa */
			System.out.println("Mensagem: " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro em processar notas" + saida.toString());
		}

		/*
		 * finally sempre é usado quando precisa executar um processo acontecendo erro
		 * ou não do sitema
		 */
		finally {/* Sempre sera executado ocoorendo erros ou não */
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java Comigo");
		}

	}

	/*exemplo de tratamento de excecao de erros customizada usando a classe */
	public static void lerArquivo() throws FileNotFoundException {
			
		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);
		 }

	}

