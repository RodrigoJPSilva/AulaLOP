package Ex1;

public class Pessoa {
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
	}
	public boolean verifica(int idade) {
		if (idade <= 0) {
			System.out.println("!Erro: Sua idade tem de ser positva");
			return true;
		}
		else {
			this.idade = idade;
			return false;
		}
}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	}
