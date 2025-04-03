package ex1;

public class Relogio {
	private int h;
	private int m;
	private int s;
	
	
	void exibirHora() {
		System.out.println(h+":"+m+":"+s);
	}
	
	void definirHora(int hora) {
		if(hora >=0 && hora <=23) {
			h = hora;
		}else {
			System.out.println("Erro: hora fora do intervao!");
		}
	}
	
	
	void definirMinuto(int minuto) {
		if(minuto >=0 && minuto <=59) {
			m = minuto;
		}else {
			System.out.println("Erro: minuto fora do intervao!");
		}
	}
	
	
	void definirSegundo(int segundos) {
		if(segundos >=0 && segundos <=60) {
			s = segundos;
		}else {
			System.out.println("Erro: segundo fora do intervao!");
		}
	}
	
	
}
