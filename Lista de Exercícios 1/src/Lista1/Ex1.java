package Lista1;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		int num = rand.nextInt(101);
		comparar(num,scan);
		scan.close();
	}
	
	
	public static void comparar(int num, Scanner scan){
			int num1;
		do {
			System.out.println("Digite um valor entre 0 e 100: ");
			num1 = scan.nextInt();
			if(num1 > num) {
				System.out.println("Muito alto!");
			}else if(num1 < num) {
				System.out.println("Muito baixo!");
			}
		} while(num != num1); 
		
		System.out.println("Correto, o número é: " + num1);
	}
		
		
	}

