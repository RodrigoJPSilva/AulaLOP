package desafioRetangulo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo[] = new Retangulo[3];
		for (int i = 0; i < 2; i++) {
			System.out.printf("Insira a altura do %d° retângulo", i);
			retangulo[i].alt = sc.nextDouble();
			System.out.printf("Insira a base do %d° retângulo", i);
			retangulo[i].base = sc.nextDouble();
			System.out.println(retangulo[i].calcArea());
		}
		System.out.println(retangulo.toString());
	}
}
