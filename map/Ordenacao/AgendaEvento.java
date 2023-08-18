package Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
	
	private Map<LocalDate, Evento> eventosMap;
	
	private AgendaEvento() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry: eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data  " + entry.getKey());
			}
			
		}
		
			
	}

}
