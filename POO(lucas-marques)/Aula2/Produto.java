package main;
/*1. Crie uma classe chamada Produto com os seguintes
atributos: descrição, preço e quantidade;
2. Crie métodos para a classe Produto: verQuantidade,
verDescrição, verPreço;
3. Crie um método com retorno para a classe Produto
utilizando o atributo preço;
4. Crie 3 objetos do tipo Produto e faça a chamada dos
métodos contidos em cada objeto.*/
public class Produto {
	String descricao;
	int quantidade;
	double preco;

	
	 public void verQuantidade() {
	        System.out.println("Quantidade em estoque: " + quantidade);
	    }
	 public void verDescricao() {
	        System.out.println("Descrição: " + descricao);
	    }
	 public void verPreco() {
	        System.out.println("Preço: R$ " + preco);
	    }
	 public double obterValorTotal() {
	        return preco * quantidade;  
	    }
	 public void verValorTotal() {
		
		 double soma = obterValorTotal();
		 System.out.println("Os valores da quantidade eh: " + soma);
	 }
}