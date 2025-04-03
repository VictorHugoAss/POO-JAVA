package Ex7_9;

public class Diploma {
	String dataEmissao;
	Aluno aluno;
	String curso;
	
	void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	void exibirDados() {
		System.out.println("Data Emissão: "+dataEmissao+" | Aluno: "+aluno.nome+" | Curso: "+curso);
	}
	
}
