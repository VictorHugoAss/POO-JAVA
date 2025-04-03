package Ex8;

public class Main {
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		cl1.nome = "Victor";
		cl1.idade = 19;
		
		Ingresso in1 = new Ingresso();
		in1.evento = "Musical";
		in1.preco = 25.90;
		
		in1.exibirIngresso();

	}
}
