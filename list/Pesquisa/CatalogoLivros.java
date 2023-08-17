package Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

	private List<Livro> catalogoDeLivro;

	public CatalogoLivros() {

		this.catalogoDeLivro = new ArrayList();
	}

	public void adicionaLivro(String titulo, String autor, int anoPublicacao) {

		catalogoDeLivro.add(new Livro(titulo, autor, anoPublicacao));

	}

	public List<Livro> pesquisarPorAutor(String autor) {

		List<Livro> livrosAchados = new ArrayList();

		if (!catalogoDeLivro.isEmpty()) {
			for (Livro l : catalogoDeLivro) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosAchados.add(l);
				}
			}

		}
		return livrosAchados;

	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

		List<Livro> livrosAchados = new ArrayList();

		if (!catalogoDeLivro.isEmpty()) {

			for (Livro l : catalogoDeLivro) {
				if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
					livrosAchados.add(l);
				}
			}

		}

		return livrosAchados;
	}

	public List<Livro> pesquisarPorTitulo(String titulo) {
		
		//caso eu queria somente o primeiro que ele encontrar
		//Livro livroPorTitulo = null;
		// e iria colocar dentro do if: livroPorTitulo = l; break;

		List<Livro> livrosAchados = new ArrayList();

		if (!catalogoDeLivro.isEmpty()) {

			for (Livro l : catalogoDeLivro) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livrosAchados.add(l);
				}
			}

		}
		return livrosAchados;
	}

}
