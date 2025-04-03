package Ex7_9;

public class Turma {
	Aluno alunos[] = new Aluno[3];
	
	
	void setAluno(Aluno[] aluno) {
		this.alunos = aluno;
	}
	
	public void exibirAluno(int posicao) {
		System.out.println(alunos[posicao].nome);
	}
	
	public void exibirTurma() {
		for(int i = 0;i<3;i++) {
		System.out.println(alunos[i].nome);
		
	}
	
	}

}





	
	
	
	

