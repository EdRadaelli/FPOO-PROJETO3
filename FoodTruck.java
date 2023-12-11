package FoodTruck_Eduardo_Radaelli;

import java.util.List;

public class FoodTruck {
	//atributos
	public String endereco;
	public String novoEndereco;
	public String telefone;
	public String nome;
	private List<Funcionario> funcionarios; //vários funcionários*
	private List<Cliente> clientes; //vários clientes*
	
	//métodos construtores
	public FoodTruck() {
		
	}
	public FoodTruck(String endereco, String novoEndereco, String telefone, String nome, List<Funcionario> funcionarios, List<Cliente> clientes) {
		this.endereco = endereco;
		this.novoEndereco = novoEndereco;
		this.telefone = telefone;
		this.nome = nome;
		this.funcionarios = funcionarios;
		this.clientes = clientes;
	}
	
	//métodos getters e setters
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNovoEndereco() {
		return this.novoEndereco;
	}
	public void setNovoEndereco(String novoEndereco) {
		this.novoEndereco = novoEndereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	//métodos especiais
	public void abrir() {
		System.out.println("\nBem Vindo!" + "\nO FoodTruck de Comida Japonesa " + getNome() + " ja esta aberto! Venha fazer seu pedido.");
	}
	public void fechar() {
		System.out.println("\nPoxa, estamos fechando! Volte sempre ao Food Truck " + getNome() + ".");
	}
	public void mover() {
		System.out.println("AVISO! Na proxima semana nosso restaurante em rodas estara em uma nova localizacao, na " + getNovoEndereco() + ".");
	}
}
