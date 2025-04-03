package Ex10;

public class Main {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Victor";
		f1.salario = 5000;
		f1.cargo = "Assistente";
		f1.departamento = "TI";

		Funcionario f2 = new Funcionario();
		f2.nome = "Hugo";
		f2.salario = 2000;
		f2.cargo = "Assistente";
		f2.departamento = "TI";
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Miranda";
		f3.salario = 20000;
		f3.cargo = "Assistente";
		f3.departamento = "TI";
		
		Funcionario[] listaFunc = {f1,f2,f3};
		Departamento depart1 = new Departamento();
		depart1.setFunc(listaFunc);
		
		depart1.exibirFuncionarios();
		depart1.maiorSalario();
		depart1.buscarFuncionario("Victor");
	}
}
