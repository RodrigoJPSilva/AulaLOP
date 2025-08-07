package Ex3;

import java.util.Scanner;

public class Livro {
	Scanner sc = new Scanner(System.in);
	private String titulo;
	private String autor;
	private int numeroPaginas;
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
		do {
			if (numeroPaginas <= 5) {
				System.out.println("Quantidade de páginas menor que 5, insira uma quantidade maior:");
				numeroPaginas = sc.nextInt();
			}
			else {
				this.numeroPaginas = numeroPaginas;
				break;
			}
		}
		while(true);
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}
}
