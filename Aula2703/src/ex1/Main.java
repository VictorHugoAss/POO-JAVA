package ex1;

public class Main {
	public static void main(String[] args) {
		
		Relogio r = new Relogio();
		//r.h = 1;
		//r.m = 50;
		//r.s= 52;
		r.definirHora(23);
		r.definirMinuto(53);
		r.definirSegundo(25);
		r.exibirHora();
		
	}
}
