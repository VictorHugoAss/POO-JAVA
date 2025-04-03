package Ex3;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	
public ContaBancaria(String titular) {
	this.titular = titular;
	this.saldo = 0.0;
}


public void Depositar(double valor) {
	this.saldo+=valor;
}

public void Sacar(double valor) {
	if(valor<=saldo) {
		saldo-=valor;
	}else {
		System.out.println("Saldo Indisponível");
	}
}

public String getTitular() {
	return this.titular;
}

public double getSaldo() {
	return this.saldo;
}
	
	
	
}
