package argumentoPessoa;

public class Main {
	public static void main(String[] args) {
	
	Pessoa p1 = new Pessoa("Danilo", 19);
	
	p1.nome = "Danilo";
	p1.idade = 19;
	p1.peso = 74;
	p1.genero = "Masculino";	
	
	p1.alt = 1.89;
	
	System.out.println("O IMC é : " + p1.calculoImc());
	System.out.println(p1.toString());
	
	}
}
