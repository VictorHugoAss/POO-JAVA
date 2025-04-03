package Ex7_9;

public class Main {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Victor";
		aluno1.matricula = 109;
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Marlon";
		aluno2.matricula = 103;
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Leonardo";
		aluno3.matricula = 104;
		
		Diploma diploma1 = new Diploma();
		diploma1.dataEmissao = "12/12/2027";
		diploma1.curso = "POP";
		diploma1.setAluno(aluno1);
		diploma1.exibirDados();

		
		
		Aluno[] listaAlunos = {aluno1,aluno2,aluno3};
		Turma turma1 = new Turma();
		turma1.setAluno(listaAlunos);
		
		turma1.exibirAluno(1);
		turma1.exibirTurma();
	}
}
