package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		super("Um erro no processamento das notas do aluno" + erro);
	}
}
