package Ex8;

public class Ingresso {
	String evento;
	double preco;
	Cliente cliente;


void setCliente(Cliente cliente) 
{
	this.cliente = cliente;
}


void exibirIngresso() {
	System.out.println("Evento: "+ evento + " | Cliente: " + cliente.nome+ " | Preço: "+preco);
}}