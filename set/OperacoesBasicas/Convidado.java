package OperacoesBasicas;

public class Convidado {
	
	private String nome;
	private int condigoConvite;
	
	public Convidado(String nome, int condigoConvite) {
		this.nome = nome;
		this.condigoConvite = condigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCondigoConvite() {
		return condigoConvite;
	}

	public void setCondigoConvite(int condigoConvite) {
		this.condigoConvite = condigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", condigoConvite=" + condigoConvite + "]";
	}
	
	

}
