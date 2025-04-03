package Ex1;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota;


public Aluno() {
	this.nome ="Novo";
	this.matricula = 00000;
	this.nota = 0.0;
}


public void setNome(String nome) {
	this.nome = nome;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public void setNota(double nota) {
	this.nota = nota;
}

public String getNome(){
	return this.nome;
}

public int getMatricula() {
	return this.matricula;
}

public double getNota() {
	return this.nota;
}











}