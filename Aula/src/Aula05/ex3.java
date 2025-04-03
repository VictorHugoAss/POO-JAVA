package Aula05;
import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		var numero = lerNumero(scanner);
		imprimirNumero(numero);

	}
	
	public static Integer lerNumero(Scanner scanner) {
		System.out.println("Digite o numero: ");
		var numero = scanner.nextInt();
		return numero;
	}
	
	public static void imprimirNumero(Double numero) {
		System.out.println("Numero: "+numero);
	}
	
	
	}
	

