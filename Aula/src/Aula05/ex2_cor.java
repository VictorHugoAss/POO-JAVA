package Aula05;
import java.util.Scanner;

public class ex2_cor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		lerNome(scanner);

		
	}

	public static void lerNome(Scanner scanner) {
		String nome;
		boolean isValid = false; 
		do {
			System.out.println("Digite o nome: ");
			nome = scanner.nextLine();
		
			
			isValid = nome.matches("[A-Za-z]+");
		
			if(!isValid) {
				System.out.println("Nome inválido");
			}while(!isValid);
			
		imprimirNome(nome);
		
		}
	
	}
	
	
	
	public static void imprimirNome(String nome) {
		System.out.println("Nome é: " + nome);
	}
	
	}
	

