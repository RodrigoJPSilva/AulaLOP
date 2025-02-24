package aula3;

import java.util.Scanner;

public class ValoresAeB {
	public static void main(String[] args) {
		// Abrindo o Scanner
		Scanner sc = new Scanner(System.in);
		// Variaveis
		String A, B, C;

		// Entrada
		System.out.println("Seja bem vindo caro usuario");
		System.out.println("Neste codigo, voce podera colocar dois caracteres, e eles serao trocados de ordem pelo codigo");

		// String A
		System.out.print("Coloque o primeiro caractere: ");
		A = sc.nextLine();
		// String B
		System.out.print("Coloque o segundo caractere: ");
		B = sc.nextLine();

		// Saida normal
		System.out.printf("Primeiro caractere: %s\n Segundo caractere: %s\n",A,B);
		System.out.println("Agora vamos trocar os valores de lugar");
		// Processamento
		C = A;
		A = B;
		B = C;
		// Saida apos a troca
		System.out.printf("Primeiro caractere: %s\n Segundo caractere: %s\n",A,B);
		sc.close();
	}

}
