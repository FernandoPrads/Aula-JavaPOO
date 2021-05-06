package cursojava.executavel;

import aulaClasses.Aluno;
import aulaClasses.Diretor;
import aulaClasses.Pessoa;
import aulaClasses.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Fernando");
		aluno.setNomeEscola("Uninove");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("689689689");
		diretor.setNome("Guilherme");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNome("Noah");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() + " - " + diretor.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade() + " - " + secretario.msgMaiorIdade());
		
		System.out.println("Sal�rio do aluno � " + aluno.salario());
		System.out.println("Sal�rio do diretor � " + diretor.salario());
		System.out.println("Sal�rio do secret�rio � " + secretario.salario());
		
	
	}

}
