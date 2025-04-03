package Ex6;

public class ContadorPassos {
	int passos = 0;
	
	
	void darPasso() {
		passos+=1;
	}
	
	void reiniciarContagem() {
		passos = 0;
	}
	
	void exibirPassos() {
		System.out.println("Contagem: " + passos);
	}
	
	
}
