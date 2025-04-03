package Lista1;
import java.util.Scanner;


public class Ex3{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int num[] = new int[10];
		int menor=0,maior=0,media = 0;
		System.out.println("Digite 10 números inteiros: ");		
		
		for(int i=0; i<10;i++) {
			System.out.println((i+1) + ": ");
			num[i] = sc.nextInt();
			
			media += num[i];
			
			if(i==0) {
				menor = num[i];
				maior = num[i];
			}else if(num[i]>maior) {
				maior = num[i];
			}else if(num[i]<menor) {
				menor = num[i];
			}
		}
		sc.close();
		System.out.println("Maior: "+maior+"| Menor: " +menor+"| Média: "+media/10);
	}
	
	
	
}
