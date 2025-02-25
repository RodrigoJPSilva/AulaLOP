package aula3;

import java.util.Scanner;

public class ValoresAeB {
	public static void main(String[] args) {
		// Abrindo o Scanner
		Scanner sc = new Scanner(System.in);
		// Variaveis
		String a, b, c;

		// Entrada
		System.out.println("Seja bem vindo caro usuario");
		System.out.println("Neste codigo, voce podera colocar dois caracteres, e eles serao trocados de ordem pelo codigo");

		// String a
		System.out.print("Coloque o primeiro caractere: ");
		a = sc.nextLine();
		// String b
		System.out.print("Coloque o segundo caractere: ");
		b = sc.nextLine();

		// Saida normal
		System.out.printf("Primeiro caractere: %s\n Segundo caractere: %s\n",a,b);
		System.out.println("Agora vamos trocar os valores de lugar");
		// Processamento
		c = a;
		a = b;
		b = c;
		// Saida apos a troca
		System.out.printf("Primeiro caractere: %s\n Segundo caractere: %s\n",a,b);

		//Fechando o Scanner
		sc.close();
	}

}
