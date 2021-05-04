package aulaClasses;

/*Classe filha de Pessoa*/
public class Diretor extends Pessoa {

	private String registroEducação;
	private int tempoDirecao;
	private String titulacao;
	
	
	
	public String getRegistroEducação() {
		return registroEducação;
	}
	public void setRegistroEducação(String registroEducação) {
		this.registroEducação = registroEducação;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducação=" + registroEducação + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	@Override
		public boolean pessoaMaiorIdade() {
			// TODO Auto-generated method stub
			return super.pessoaMaiorIdade();
		}
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Obaa o diretor é maior de idade" : "Ixii vc é menor de idade";
	}

	
	
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	
	
	
	
		
	
}
