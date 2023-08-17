package OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;


public class ListaTarefa {
	
	private List<Tarefa> listaTarefa;

	public ListaTarefa() {
		this.listaTarefa = new ArrayList<>();
	}
	
	public void adicionarTarefa (String descricao) {
		listaTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		// pega todas tarefas que tem a descrição e coloca dentro do ArrayList
		for(Tarefa t : listaTarefa ) {
			if(t.getDescricao().equalsIgnoreCase(descricao))
				tarefasParaRemover.add(t);
		}
		
		//remove todas tarefas da listaTarefa que estiverem dentro de tarefasParaRemover
		listaTarefa.removeAll(tarefasParaRemover);
		
	}
	
	public int obterNumeroTotalTarefas() {
		return listaTarefa.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaTarefa);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		listaTarefa.adicionarTarefa("teste");
		listaTarefa.adicionarTarefa("borracha");
		listaTarefa.adicionarTarefa("borracha");
		listaTarefa.obterDescricoesTarefas();
		System.out.println("Numero de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
		
	}

}
