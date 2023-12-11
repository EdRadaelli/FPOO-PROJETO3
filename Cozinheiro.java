package FoodTruck_Eduardo_Radaelli;

public class Cozinheiro extends Funcionario{
	//métodos construtores
	public Cozinheiro() {
		
	}
	public Cozinheiro(String nome, String cpf, int idade, String telefone, String funcao, float salario) {
		super(nome, cpf, idade, telefone, funcao, salario);
	}
	
	//método especial
	@Override
	public void executarFuncao() {
		System.out.println("\nO cozinheiro " + getNome() + " comecou a preparar o pedido do cliente.");
	}
}
