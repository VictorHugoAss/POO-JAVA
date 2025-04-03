package Lista1;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int idade;
		do {
			System.out.println("Digite a idade do atleta: ");
			idade = scan.nextInt();
			verificarCategoria(idade);
		}while (idade>=0);
		
		System.out.println("Idade Inválida");
		scan.close();
	}
	
	
	public static void verificarCategoria(int idade) {
		if(idade>=0 && idade <=12) {
			System.out.println("Categoria Infantil");
		}else if(idade>12 && idade<18) {
			System.out.println("Categoria Juvenil");
		}else if(idade>17 && idade <41) {
			System.out.println("Categoria Adulto");
		}else if(idade>40) {
			System.out.println("Categoria Master");
		}
		
	}
		
	}
	

