package Aula04;

public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
    
    Cliente cliente;

    Conta(Cliente cliente){
    	dono = cliente.nome;
    	limite = 5000;
    }
    
    
    void mostrar(){
        System.out.println("Numero:  " + numero + " Dono: " + dono + " Saldo: "+saldo+" Limite: "+limite);
    }

    void depositar(double quantidade){
        saldo = saldo+quantidade;
    }

    void sacar(double quantidade){
        if(quantidade<=(saldo+limite)){
            saldo = saldo - quantidade;
        }else{
            System.out.println("Não foi possível sacar!");
        }
    }





}