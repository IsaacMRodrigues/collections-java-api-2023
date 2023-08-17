package Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
	
	private Set<Contato> agendaDeContatos;

	public AgendaContatos() {
		this.agendaDeContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		agendaDeContatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(agendaDeContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : agendaDeContatos) {
			
			//startswith exemplo: isaac, isaac martins, isaac rodrigues, vai retorna todos que começam com o nome passado
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		
		return contatosPorNome;
	}
	
	public void pesquisarPorNome1(String nome) {
		for( Contato c : agendaDeContatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				System.out.println(c);
				break;
			}
		}
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for( Contato c : agendaDeContatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumeroTelefone(novoNumero);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Isaac", 1);
		agendaContatos.adicionarContato("Isaac Martins", 2);
		agendaContatos.adicionarContato("Isaac Rodrigues", 3);
		agendaContatos.adicionarContato("Corbuto", 5);
		agendaContatos.adicionarContato("Fermento", 4);
	
		agendaContatos.exibirContatos();
		System.out.println();
		System.out.println(agendaContatos.pesquisarPorNome("Isaac"));
		System.out.println();
		agendaContatos.pesquisarPorNome1("Isaac");
		System.out.println();
		
		agendaContatos.atualizarNumeroContato("Isaac", 10);
		
		agendaContatos.exibirContatos();
		
	}
	
	

}
