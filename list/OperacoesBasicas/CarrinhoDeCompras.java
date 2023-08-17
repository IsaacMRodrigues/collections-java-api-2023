package OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private List<Item> listaItens;
	

	public CarrinhoDeCompras() {
		this.listaItens = new ArrayList();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item>itensParaRemover = new ArrayList();
		
		for(Item i : listaItens) {
			if(i.getNome().equalsIgnoreCase(nome))
				itensParaRemover.add(i);
		}
		
		listaItens.removeAll(itensParaRemover);	
	}
	
	private double calcularValorTotal() {
		double valorTotal = 0;
		for (Item i: listaItens) {
			valorTotal = valorTotal + (i.getPreco() * i.getQuantidade());
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(listaItens);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem("pc gamer", 100, 1);
		carrinho.adicionarItem("carro", 200, 1);
		carrinho.adicionarItem("aviao", 300, 1);
		carrinho.removerItem("aviao");
		carrinho.adicionarItem("mesa", 400, 2);
		carrinho.exibirItens();

		System.out.println("Valor total " + carrinho.calcularValorTotal());
		
	}

}
