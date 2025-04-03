package Ex10;
public class Departamento {
	Funcionario funcionarios[] = new Funcionario[3];
	
	
	void setFunc(Funcionario[] funcionario) {
		this.funcionarios = funcionario;
	}
	
	void exibirFuncionarios() {
		for(int i = 0;i<3;i++) {
		System.out.println(funcionarios[i].nome);
		
	}}
	
	void maiorSalario() {
		double maiorSalario =0;
		int posSalario = 0;
		for(int i=0;i<3;i++) {
	
			if(i==0) {
				maiorSalario = funcionarios[i].salario;
				posSalario = i;
			}else if(funcionarios[i].salario > maiorSalario) {
				maiorSalario = funcionarios[i].salario;
				posSalario = i;
			}
		}
		System.out.println("O maior salario é do funcionario: " +funcionarios[posSalario].nome+" Salario: "+ funcionarios[posSalario].salario);
	}
	void buscarFuncionario(String nome) {
		int existe = 0;
		for(int i = 0;i<3;i++) {
			
			if(funcionarios[i].nome == nome) {
				existe = 1;
			}
		
	}
		if(existe == 1) {
			System.out.println("O Funcionário está no departamento");
		}else {
			System.out.println("O Funcionário não está no departamento");
		}
	
	
	}
}





	