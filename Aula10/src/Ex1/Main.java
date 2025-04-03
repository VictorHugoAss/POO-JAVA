package Ex1;

public class Main {

	public static void main(String[] args) {
		
		Aluno p = new Aluno();
		
		System.out.println("Nome: "+ p.getNome()+" | Matricula: "+p.getMatricula()+" | Nota: "+p.getNota());
		
		p.setNome("Victor");
		p.setMatricula(42694);
		p.setNota(10.0);
		
		System.out.println("Nome: "+ p.getNome()+" | Matricula: "+p.getMatricula()+" | Nota: "+p.getNota());
		
	}
	
	
	
	
	
	
	
}
