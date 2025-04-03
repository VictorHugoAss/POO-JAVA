package Aula04;

public class Main {
    public static void main(String[] args){
    	
    Cliente cli = new Cliente();
    cli.cpf = "0123";
    cli.nome = "Victor";
    	
    Conta c = new Conta(cli);
    c.cliente = cli;
    c.numero = 222;
    c.limite = 5000;
    c.saldo = 2350;

    System.out.println(c.cliente.nome);
    

    c.depositar(125);

    c.sacar(1000000);

    c.mostrar();



    }
}
