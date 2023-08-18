package Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEvento {
	
	private Map<LocalDate, Evento> eventosMap;
	
	private AgendaEvento() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}

}
