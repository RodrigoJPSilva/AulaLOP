package frutaComArgumento;

public class Fruta {
	
	public String nome;
	public String tipo;
	public Fruta(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	public String getFruta() {
		return nome+tipo;
	}
	
}
