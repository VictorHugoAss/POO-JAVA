package Aula05;
import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		Double value = realDouble(scanner);
		printValue(value);
	
	}
	public static Double realDouble(Scanner scanner) {
			System.out.println("Digite um numero: ");
			var value = scanner.nextDouble();
			return value;
	}
	
	public static void printValue(Double value) {
		System.out.println("O valor é: " + value);
	}
	
}
