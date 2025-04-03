package Ex2;

public class Produto {
	private String nome;
	private int quantidade;
	
	
public Produto() {
	this.nome = "Novo";
	this.quantidade = 0;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setQuantidade(int quantidade) {
	if(quantidade>=0) {
		this.quantidade = quantidade;
	}else {
		System.out.println("Quantidade Inválida");
	}
}


public String getNome() {
	return this.nome;
}
	
public int getQuantidade() {
	return this.quantidade;
}
	
	
	
	
	
	
	
	
}
