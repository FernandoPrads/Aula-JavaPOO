package aulaClasses;

/*Classe filha de Pessoa*/
public class Diretor extends Pessoa {

	private String registroEduca��o;
	private int tempoDirecao;
	private String titulacao;
	
	
	
	public String getRegistroEduca��o() {
		return registroEduca��o;
	}
	public void setRegistroEduca��o(String registroEduca��o) {
		this.registroEduca��o = registroEduca��o;
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
		return "Diretor [registroEduca��o=" + registroEduca��o + ", tempoDirecao=" + tempoDirecao + ", titulacao="
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
		return this.pessoaMaiorIdade() ? "Obaa o diretor � maior de idade" : "Ixii vc � menor de idade";
	}

	
	
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	
	
	
	
		
	
}
