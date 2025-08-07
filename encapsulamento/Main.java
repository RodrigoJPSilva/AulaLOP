package encapsulamento;

public class Main {
	public static void main(String[] args) {
		Musica music = new Musica();
		
		music.setTitulo("24k Magic");
		music.setGenero("POP");
		
		System.out.println(music.getTitulo() + " " + music.getGenero());
	}

}
