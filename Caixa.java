package FoodTruck_Eduardo_Radaelli;

public class Caixa extends Funcionario{
	//métodos construtores
	public Caixa() {
		
	}
	public Caixa(String nome, String cpf, int idade, String telefone, String funcao, float salario) {
		super(nome, cpf, idade, telefone, funcao, salario);
	}
		
	//método especial
	@Override
	public void executarFuncao() {
		System.out.println("\nO caixa " + getNome() + " esta atendendo o cliente.");
	}
	public void cardapioComida() {
		System.out.println("\n--------CARDAPIO COMIDA--------");
		System.out.println("Comidas: " + "\n1 - Sushi;" + "\n2 - Sashimi;" + "\n3 - Temaki;" + "\n4 - Hot Roll.");
		System.out.println("-------------------------------");
	}
	public void cardapioBebida() {
		System.out.println("\n--------CARDAPIO BEBIDA--------");
		System.out.println("Bebidas: " + "\n1 - Shochu;" + "\n2 - Cha Preto;" + "\n3 - Saque;" + "\n4 - Umeshu.");
		System.out.println("-------------------------------");
	}
}
