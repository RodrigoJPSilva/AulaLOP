package frutaSemArgumento;

import java.util.Random;

public class Fruta {

	public String nome;
	public String tipo;
	int estado;

	public Fruta() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = " " + nome + " ";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = " " + tipo + " ";
	}

	public String getFruta() {
		return nome + tipo;
	}

	public void nutrir() {
		System.out.println("Agora a" + nome + tipo + "está nutrida");
		estado = 0;
	}

	public void apodrecer() {
		System.out.println("Agora a" + nome + tipo + "está podre");
		estado = 1;
	}

	public void amadurecer() {
		System.out.println("Agora a sua" + nome + tipo + "está madura, pronta para comer");
		estado = 2;
	}

	public String comer() {
		if(estado == 0) 
			return "Hmmm, pelo visto estava uma delicia!";
		else if (estado == 1) 
			return "Mas que pena, a" + nome + tipo + "causou a sua morte :(";
		else
			return "Você comeu a fruta, fim.";
	}
	
	public String verificaEstadoFruta() {
		Random rd = new Random();
		this.estado = rd.nextInt(3);
		switch (estado) {
		case 0: {
			return "A" + nome + tipo + "está nutrida";
		}
		case 1: {
			return "A" + nome + tipo + "está podre";
		}
		case 2: {
			return "A" + nome + tipo + "está madura, pronta para comer";
		}
		default:
			return "Unexpected value:" + estado;
		}
	}
}
