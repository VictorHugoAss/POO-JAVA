package Ex5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Carro carro1 = new Carro();
		int opcao = 0, valor =0;

		
	do {
		System.out.println("Digite 1 para acelerar | 2 para frear | Qualquer outro número para desligar");
		opcao = sc.nextInt();
		switch(opcao) {
			case 1 :
				System.out.println("Digite quanto quer acelerar");
				valor = sc.nextInt();
				carro1.acelerar(valor);
				break;
			case 2 : 
				System.out.println("Digite quanto quer frear");
				valor = sc.nextInt();
				carro1.frear(valor);
				
				break;
			case 0:
				break;
	}}while(opcao==1 || opcao == 2);
		
		sc.close();
		

}
	}