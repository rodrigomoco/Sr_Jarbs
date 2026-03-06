package main;

public class Funcao_main {

	public static void main(String[] args) {
		Produto NovoProduto = new Produto();
		NovoProduto.descricao = "Roteador";
		NovoProduto.quantidade = 2;
		NovoProduto.preco = 100;
	/*	System.out.println("Nome do meu Produto: " + NovoProduto.descricao);
		System.out.println("Unidade de Produtos: " + NovoProduto.quantidade);
		System.out.println("Valor do Produto: " + NovoProduto.preco);
	*/	NovoProduto.verDescricao();
		NovoProduto.verQuantidade();
		NovoProduto.verPreco();
		NovoProduto.obterValorTotal();
		NovoProduto.verValorTotal();
		System.out.println("\n");
		
		Produto NovoProduto2 = new Produto();
		NovoProduto2.descricao = "lampada";
		NovoProduto2.quantidade = 2;
		NovoProduto2.preco = 15;
	/*	System.out.println("Nome do meu Produto: " + NovoProduto2.descricao);
		System.out.println("Unidade de Produtos: " + NovoProduto2.quantidade);
		System.out.println("Valor do Produto: " + NovoProduto2.preco);
	*/	NovoProduto2.verDescricao();
		NovoProduto2.verQuantidade();
		NovoProduto2.verPreco();
		NovoProduto2.obterValorTotal();
		NovoProduto2.verValorTotal();
		System.out.println("\n");
		
		Produto NovoProduto3 = new Produto();
		NovoProduto3.descricao = "Cama";
		NovoProduto3.quantidade = 1;
		NovoProduto3.preco = 2500;
	/*	System.out.println("Nome do meu Produto: " + NovoProduto3.descricao);
		System.out.println("Unidade de Produtos: " + NovoProduto3.quantidade);
		System.out.println("Valor do Produto: " + NovoProduto3.preco);
	*/	
		NovoProduto3.verDescricao();
		NovoProduto3.verQuantidade();
		NovoProduto3.verPreco();
		NovoProduto3.obterValorTotal();
		NovoProduto3.verValorTotal();
		
		
		
	}

}
