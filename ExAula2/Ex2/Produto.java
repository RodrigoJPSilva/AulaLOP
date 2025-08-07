package Ex2;

public class Produto {
	private String nome;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void desconto(double percentual) {
		percentual *= 0.10;
		this.preco *= percentual;
		System.out.println();
	}
	
}
