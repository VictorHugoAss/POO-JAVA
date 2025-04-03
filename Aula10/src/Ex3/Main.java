package Ex3;

public class Main {
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria("Victor");
		System.out.println("Titular: "+c.getTitular()+ " | Saldo: "+c.getSaldo());
		
		
		c.Depositar(500);
		c.Sacar(600);
		System.out.println(c.getSaldo());
		
		
	}
}
