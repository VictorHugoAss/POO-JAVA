package Ex2;

public class Main {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		System.out.println("Nome: " + p.getNome()+ " | Quantidade: " + p.getQuantidade());
		
		p.setNome("Computador");
		p.setQuantidade(6);
		System.out.println("Nome: " + p.getNome()+ " | Quantidade: " + p.getQuantidade());
	
	}
}
