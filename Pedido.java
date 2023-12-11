package FoodTruck_Eduardo_Radaelli;

public class Pedido {
	//atributos
	private String pagamento;
	private float valor;
	private boolean entregarCasa;
	private ItemPedido itempedido;
	private Entregador entregas;
	
	//métodos construtores
	public Pedido() {
		
	}
	public Pedido(float valor, Entregador entregas) {
		this.valor = valor;
		this.entregas = entregas;
	}
	
	//métodos getters e setters
	public String getPagamento() {
		return this.pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Entregador getEntregas() {
		return this.entregas;
	}
	public void setEntregas(Entregador entregas) {
		this.entregas = entregas;
	}
	public boolean getEntregarCasa() {
		if(entregarCasa == true) {
			System.out.println("O entregador vai realizar a entrega do pedido em sua residencia.");
			entregas.executarFuncao();
		}else {
			System.out.println("Aqui esta o seu pedido. Tenha um bom dia!");
		}
		return this.entregarCasa;
	}
	public void setEntregarCasa(boolean entregarCasa) {
		this.entregarCasa = entregarCasa;
	}
	public ItemPedido getItemPedido(){
		return this.itempedido;
	}
	public void setItemPedido(ItemPedido ItemPedido) {
		this.itempedido = itempedido;
	}
	
	
	//método especial
	public void finalizarPedido() {
		System.out.println("O pedido foi finalizado! Valor: R$ " + getValor() + "\nQual a forma de pagamento?: ");
	}
}
