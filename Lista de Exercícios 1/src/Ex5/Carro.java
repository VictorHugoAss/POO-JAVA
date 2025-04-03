package Ex5;

public class Carro {
	String modelo = "Fusion";
	int velocidadeAtual = 180;
	
	
	void acelerar(int valor) {
		velocidadeAtual+=valor;
		System.out.println("Você acelerou e foi de  " + (velocidadeAtual-valor) + " para " + velocidadeAtual);
	}
	
	void frear(int valor) {
		velocidadeAtual-=valor;
		System.out.println("Você reduziu de  " + (velocidadeAtual+valor) + " para " + velocidadeAtual);
	}
		
}

