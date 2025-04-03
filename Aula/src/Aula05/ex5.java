package Aula05;


public class ex5 {
	
	public static void main(String[] args) {
	
	Integer num1 = 5,num2=12,resultadoSoma;
	
		resultadoSoma = somaNumeros(num1,num2);
		
		System.out.println("A soma é: "+resultadoSoma);
			
			
	}
	
public static Integer somaNumeros(Integer num1,Integer num2) {
	Integer soma = num1 + num2;
	return soma;
}


}
	


