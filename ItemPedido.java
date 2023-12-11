package FoodTruck_Eduardo_Radaelli;

public class ItemPedido {
	//atributos
	public String nome;
	public float preco;
	public int quantidade;
	
	//métodos construtores
	public ItemPedido() {
		
	}
	public ItemPedido(String nome, float preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//métodos getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return this.preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
