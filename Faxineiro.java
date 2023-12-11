package FoodTruck_Eduardo_Radaelli;

public class Faxineiro extends Funcionario{
	//métodos construtores
	public Faxineiro() {
		
	}
	public Faxineiro(String nome, String cpf, int idade, String telefone, String funcao, float salario) {
		super(nome, cpf, idade, telefone, funcao, salario);
	}
		
	//método especial
	@Override
	public void executarFuncao() {
		System.out.println("\nO faxineiro " + getNome() + " esta limpando o chao.");
	}
}
