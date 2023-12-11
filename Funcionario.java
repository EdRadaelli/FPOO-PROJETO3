package FoodTruck_Eduardo_Radaelli;

public class Funcionario extends Pessoa{
	//atributos
	private String funcao;
	private float salario;
	
	//métodos construtores
	public Funcionario() {
		
	}
	public Funcionario(String nome, String cpf, int idade, String telefone, String funcao, float salario) {
		super(nome, cpf, idade, telefone);
		this.funcao = funcao;
		this.salario = salario;
	}
	
	//métodos getters e setters
	public String getFuncao() {
		return this.funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//método especial
	public void executarFuncao() {
		System.out.println("O " + getFuncao() + " " + getNome() + " esta realizando a sua funcao!");
	}
}
