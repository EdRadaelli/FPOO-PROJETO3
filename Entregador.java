package FoodTruck_Eduardo_Radaelli;

public class Entregador extends Funcionario{
	//métodos construtores
	public Entregador() {
		
	}
	public Entregador(String nome, String cpf, int idade, String telefone, String funcao, float salario) {
		super(nome, cpf, idade, telefone, funcao, salario);
	}
	
	//método especial
	@Override
	public void executarFuncao() {
		System.out.println("O entregador " + getNome() + " esta indo entregar o pedido ao cliente.");
	}
}
