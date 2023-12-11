package FoodTruck_Eduardo_Radaelli;

public class Cliente extends Pessoa{
	//métodos construtores
	public Cliente() {

	}
	public Cliente(String nome, String cpf, int idade, String telefone) {
		super(nome, cpf, idade, telefone);
	}
	
	//métodos especiais
	public void comer() {
		System.out.println("\nO cliente " + getNome() + " esta comendo o pedido.");
		System.out.println("Hum! O pedido esta uma delicia.");
	}
	public void comprar() {
		System.out.println("\nO cliente " + getNome() + " realizou a compra, aguarde o pedido!");
	}
}
