package FoodTruck_Eduardo_Radaelli;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TesteFoodTruck {

	public static void main(String[] args) {
		//entrada Scanner
		Scanner entrada = new Scanner(System.in);
		
		//instanciar objetos
		//Funcionario
			//funcionario1
		System.out.println("Funcionarios: ");
		System.out.println("------DADOS DO FUNCIONARIO 1------");
		System.out.println("Nome: ");
		String nomeFuncionario = entrada.next();
		System.out.println("CPF: ");
		String cpfFuncionario = entrada.next();
		System.out.println("Idade: ");
		int idadeFuncionario = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneFuncionario = entrada.next();
		Funcionario funcionario1 = new Funcionario(nomeFuncionario, cpfFuncionario, idadeFuncionario, telefoneFuncionario, "Cozinheiro", 2500);
		System.out.println("----------------------------------");
	
			//funcionario2
		System.out.println("------DADOS DO FUNCIONARIO 2------");
		System.out.println("Nome: ");
		String nomeFuncionario1 = entrada.next();
		System.out.println("CPF: ");
		String cpfFuncionario1 = entrada.next();
		System.out.println("Idade: ");
		int idadeFuncionario1 = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneFuncionario1 = entrada.next();
		Funcionario funcionario2 = new Funcionario(nomeFuncionario1, cpfFuncionario1, idadeFuncionario1, telefoneFuncionario1, "Caixa", 1800);
		System.out.println("----------------------------------");
	
			//funcionario3
		System.out.println("------DADOS DO FUNCIONARIO 3------");
		System.out.println("Nome: ");
		String nomeFuncionario2 = entrada.next();
		System.out.println("CPF: ");
		String cpfFuncionario2 = entrada.next();
		System.out.println("Idade: ");
		int idadeFuncionario2 = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneFuncionario2 = entrada.next();
		Funcionario funcionario3 = new Funcionario(nomeFuncionario2, cpfFuncionario2, idadeFuncionario2, telefoneFuncionario2, "Entregador", 2200);
		System.out.println("----------------------------------");
    
			//funcionario4
		System.out.println("------DADOS DO FUNCIONARIO 4------");
		System.out.println("Nome: ");
		String nomeFuncionario3 = entrada.next();
		System.out.println("CPF: ");
		String cpfFuncionario3 = entrada.next();
		System.out.println("Idade: ");
		int idadeFuncionario3 = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneFuncionario3 = entrada.next();
		Funcionario funcionario4 = new Funcionario(nomeFuncionario3, cpfFuncionario3, idadeFuncionario3, telefoneFuncionario3, "Faxineiro", 1950);
		System.out.println("----------------------------------");
    
		//instancia da lista vazia
		List<Funcionario> lista_funcionario = new ArrayList<Funcionario>();
		//adicionando clientes a lista
		lista_funcionario.add(funcionario1);
		lista_funcionario.add(funcionario2);
		lista_funcionario.add(funcionario3);
		lista_funcionario.add(funcionario4);
		//lendo os clientes que estão na lista
		System.out.println("\nATENCAO! OS DADOS A SEGUIR SAO CONFIDENCIAIS, NAO DIVULGUE OU COMPARTILHE!");
		System.out.println("Carteira de trabalho dos funcionarios do FoodTruck:");
		for(Funcionario listadefuncionarios : lista_funcionario) {
  		System.out.println(" - Nome: " + listadefuncionarios.getNome() + "\n - CPF: " + listadefuncionarios.getCpf() + "\n - Idade: " 
  				+ listadefuncionarios.getIdade() + " anos" + "\n - Telefone: " + listadefuncionarios.getTelefone() + "\n - Funcao: " 
  				+ listadefuncionarios.getFuncao() + "\n - Salario: R$ " + listadefuncionarios.getSalario());
  		System.out.println("---------------------------------------");
		}
  
		//Cliente
			//cliente1
		System.out.println("\nClientes: ");
		System.out.println("------DADOS DO CLIENTE 1------");
		System.out.println("Nome: ");
		String nomeCliente = entrada.next();
		System.out.println("CPF: ");
		String cpfCliente = entrada.next();
		System.out.println("Idade: ");
		int idadeCliente = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneCliente = entrada.next();
		System.out.println("-----------------------------");
		Cliente cliente1 = new Cliente(nomeCliente, cpfCliente, idadeCliente, telefoneCliente);
		
			//cliente2
		System.out.println("------DADOS DO CLIENTE 2------");
		System.out.println("Nome: ");
		String nomeCliente1 = entrada.next();
		System.out.println("CPF: ");
		String cpfCliente1 = entrada.next();
		System.out.println("Idade: ");
		int idadeCliente1 = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneCliente1 = entrada.next();
		System.out.println("-----------------------------");
		Cliente cliente2 = new Cliente(nomeCliente1, cpfCliente1, idadeCliente1, telefoneCliente1);
		
			//cliente3
		System.out.println("------DADOS DO CLIENTE 3------");
		System.out.println("Nome: ");
		String nomeCliente2 = entrada.next();
		System.out.println("CPF: ");
		String cpfCliente2 = entrada.next();
		System.out.println("Idade: ");
		int idadeCliente2 = entrada.nextInt();
		System.out.println("Telefone: ");
		String telefoneCliente2 = entrada.next();
		System.out.println("-----------------------------");
		Cliente cliente3 = new Cliente(nomeCliente2, cpfCliente2, idadeCliente2, telefoneCliente2);
		
		//instancia da lista vazia
		List<Cliente> lista_clientes = new ArrayList<Cliente>();
		//adicionando clientes a lista
		lista_clientes.add(cliente1);
		lista_clientes.add(cliente2);
		lista_clientes.add(cliente3);
		//lendo os clientes que estão na lista
		System.out.println("\nATENCAO! OS DADOS A SEGUIR SAO CONFIDENCIAIS, NAO DIVULGUE OU COMPARTILHE!");
		System.out.println("Informacoes pessoais da comanda dos clientes do FoodTruck: ");
		for(Cliente listadeclientes : lista_clientes) {
			System.out.println(" - Nome: " + listadeclientes.getNome() + "\n - CPF: " + listadeclientes.getCpf() + "\n - Idade: " 
		+ listadeclientes.getIdade() + " anos" + "\n - Telefone: " + listadeclientes.getTelefone());
			System.out.println("---------------------------------------");
		}
	
		//FoodTruck      
			//foodtruck1
		FoodTruck foodtruck1 = new FoodTruck("Rua Coronel Rafael Tobias", "Rua Nicolau Antonio Lobo", "(19)3583-2476", "Radaeri", lista_funcionario, lista_clientes);
		foodtruck1.abrir();
		funcionario4.executarFuncao();
		
		//instancia Entregador
			//entregador
		Entregador entregador = new Entregador(nomeFuncionario2, cpfFuncionario2, idadeFuncionario2, telefoneFuncionario2, "Entregador", 2200);
		//instancia Cozinheiro
			//cozinheiro
		Cozinheiro cozinheiro = new Cozinheiro(nomeFuncionario, cpfFuncionario, idadeFuncionario, telefoneFuncionario, "Cozinheiro", 2500);
		//instancia Caixa
			//caixa
		Caixa caixa = new Caixa(nomeFuncionario1, cpfFuncionario1, idadeFuncionario1, telefoneFuncionario1, "Caixa", 1800);
		
		caixa.executarFuncao();
		System.out.println("\nQual o seu pedido?: " + "\n1 - Comida;" + "\n2 - Bebida.");
		int numeroMenu = entrada.nextInt();
		float valorTotal = 0;
		List<ItemPedido> lista_pedidos = new ArrayList<ItemPedido>();
		do{ 
			switch(numeroMenu) {
			case(1):
				caixa.cardapioComida();
				System.out.println("Escolha um item do cardapio: ");
				int numeroPedido = entrada.nextInt();
				switch(numeroPedido) {
				case(1):
					System.out.println("Voce escolheu a opcao de Sushi!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido = entrada.nextInt();
					ItemPedido sushi = new ItemPedido("Sushi", 2.50f, quantidadePedido);
					valorTotal = valorTotal + (quantidadePedido * sushi.getPreco());
					lista_pedidos.add(sushi);
					break;
				case(2):
					System.out.println("Voce escolheu a opcao de Sashimi!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido1 = entrada.nextInt();
					ItemPedido sashimi = new ItemPedido("Sashimi", 5f, quantidadePedido1);
					valorTotal = valorTotal + (quantidadePedido1 * sashimi.getPreco());
					lista_pedidos.add(sashimi);
					break;
				case(3):
					System.out.println("Voce escolheu a opcao de Temaki!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido2 = entrada.nextInt();
					ItemPedido temaki = new ItemPedido("Temaki", 20f, quantidadePedido2);
					valorTotal = valorTotal + (quantidadePedido2 * temaki.getPreco());
					lista_pedidos.add(temaki);
					break;
				case(4):
					System.out.println("Voce escolheu a opcao de Hot Roll!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido3 = entrada.nextInt();
					ItemPedido hotroll = new ItemPedido("Hot Roll", 3.50f, quantidadePedido3);
					valorTotal = valorTotal + (quantidadePedido3 * hotroll.getPreco());
					lista_pedidos.add(hotroll);
					break;
				default:
			    	System.out.println("Pedido invalido!");
			    	break;
				}
			case(2):
				caixa.cardapioBebida();
				System.out.println("Escolha um item do cardapio: ");
				int numeroPedido2 = entrada.nextInt();	
				switch(numeroPedido2) {
				case(1):
					System.out.println("Voce escolheu a opcao de Shoshu!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido4 = entrada.nextInt();
					ItemPedido shoshu = new ItemPedido("Shoshu", 50.50f, quantidadePedido4);
					valorTotal = valorTotal + (quantidadePedido4 * shoshu.getPreco());
					lista_pedidos.add(shoshu);
					break;
				case(2):
					System.out.println("Voce escolheu a opcao de Cha Preto!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido5 = entrada.nextInt();
					ItemPedido chapreto = new ItemPedido("Cha Preto", 14.10f, quantidadePedido5);
					valorTotal = valorTotal + (quantidadePedido5 * chapreto.getPreco());
					lista_pedidos.add(chapreto);
					break;
				case(3):
					System.out.println("Voce escolheu a opcao de Saque!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido6 = entrada.nextInt();
					ItemPedido saque = new ItemPedido("Saque", 32.80f, quantidadePedido6);
					valorTotal = valorTotal + (quantidadePedido6 * saque.getPreco());
					lista_pedidos.add(saque);
					break;
				case(4):
					System.out.println("Voce escolheu a opcao de Umeshu!");
					System.out.println("Qual a quantidade?: ");
					int quantidadePedido7 = entrada.nextInt();
					ItemPedido umeshu = new ItemPedido("Umeshu", 45.90f, quantidadePedido7);
					valorTotal = valorTotal + (quantidadePedido7 * umeshu.getPreco());
					lista_pedidos.add(umeshu);
					break;
				default:
			    	System.out.println("Pedido invalido!");
			    	break;
				}
				break;
			} break;
		}while(numeroMenu != 0);
		
		Pedido pedido1 = new Pedido(valorTotal, entregador);
		System.out.println("\n-------NOTA FISCAL-------");
		for(ItemPedido listaitemspedido : lista_pedidos) {
			System.out.println(" - " + listaitemspedido.getNome() + ", R$ " + listaitemspedido.getPreco() + " x" + listaitemspedido.getQuantidade());
		}
		System.out.println("-------------------------");
		pedido1.finalizarPedido();
		pedido1.setPagamento(entrada.next());
		System.out.println("O pagamento no " + pedido1.getPagamento() + " foi efetuado.");
		cliente1.comprar();
		
		cozinheiro.executarFuncao();
		
		System.out.println("\nVoce prefere a entrega em residencia?: ");
		pedido1.setEntregarCasa(entrada.nextBoolean());
		pedido1.getEntregarCasa();
		
		cliente1.comer();
		
		foodtruck1.fechar();
		foodtruck1.mover();
		
	}
	

}
