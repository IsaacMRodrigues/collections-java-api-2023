package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalDoEstoque() {
		double valorTotalEstoque = 0;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		}
		
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					maiorPreco =p.getPreco();
					produtoMaisCaro =p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco() < menorPreco) {
					menorPreco = p.getPreco();		
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public static void main(String[] args) {
	    EstoqueProdutos estoque = new EstoqueProdutos();
	    estoque.exibirProdutos();

	    estoque.adicionarProduto(1L, "Produto A", 1, 50.0);
	    estoque.adicionarProduto(2L, "Produto B", 5, 11.0);
	    estoque.adicionarProduto(3L, "Produto C", 3, 10.0);
	    estoque.adicionarProduto(3L, "Produto D", 2, 4.0);

	    estoque.exibirProdutos();

	    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalDoEstoque());
	    System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
	    System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
	  }

}
