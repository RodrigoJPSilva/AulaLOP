package Ex1GetSet;

import java.util.Scanner;

public class Pessoa {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		do {
			if (idade <= 0) {
				System.out.println("!Erro: Sua idade tem de ser positva");
				idade = sc.nextInt();
			}
			else {
				this.idade = idade;
			}
		}
		while(true);
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	}
