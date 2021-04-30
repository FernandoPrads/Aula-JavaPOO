package cursojava.executavel;

import aulaClasses.Aluno;
import aulaClasses.Diretor;
import aulaClasses.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Fernando");
		aluno.setNomeEscola("Uninove");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("689689689");
		diretor.setNome("Guilherme");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("Noah");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
