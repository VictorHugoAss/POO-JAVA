package Lista1;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int num[] = new int[15];
		int par = 0;
		int impar = 0;
		
		Scanner sc = new Scanner(System.in);
			
		for(int i=0;i<15;i++) {
			System.out.println((i+1)+": ");
			num[i] = sc.nextInt();
			if(num[i]%2 ==0 ) {
				par++;
			}else {
				impar++;
			}
			
		}
		
		System.out.println("Quantidade de Pares: "+par+"| Quantidade de Ímpares: "+impar);
		sc.close();
	}
}
