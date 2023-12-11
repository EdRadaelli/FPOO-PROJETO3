package FoodTruck_Eduardo_Radaelli;

public class Pessoa {
	//atributos
	private String nome;
	private String cpf;
	private int idade;
	private String telefone;
	
	//métodos construtores
	public Pessoa() {
		
	}
	public Pessoa(String nome, String cpf, int idade, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	//métodos getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
