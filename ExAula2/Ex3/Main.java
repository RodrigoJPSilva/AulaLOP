package Ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro l1 = new Livro();
		System.out.println("Insira o titulo do seu livro:");
		l1.setTitulo(sc.nextLines());
		System.out.println("Insira o autor do seu livro:");
	}

}
