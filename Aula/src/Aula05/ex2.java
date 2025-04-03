import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = ler(sc);
		imprimir(nome);
		
	}

	public static String ler(Scanner sc) {
		System.out.println("Digite o seu nome: ");
		String value = sc.nextLine();
		
		return value;
	}
	
	
	public static void imprimir(String value) {
		System.out.println("Nome é: " + value);
	}
	
	}
	

