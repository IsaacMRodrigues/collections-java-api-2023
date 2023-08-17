package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	private Set<Produto> produtosSet;

	public CadastroProdutos() {
		super();
		this.produtosSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtosSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
		
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	}
	
	

}
