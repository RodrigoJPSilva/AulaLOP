package argumentoPessoa;

public class Pessoa {
	
	public String nome;
	public int idade; 
	public String genero;
	public double peso;
	public double alt;
	public double calculoImc() {
		return peso/(alt*2);		
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Nome=" + nome + "\nIdade=" + idade + "\nGenero=" + genero + "\nPeso=" + peso;
	}
}
