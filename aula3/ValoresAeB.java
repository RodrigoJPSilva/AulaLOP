package aula3;

import java.util.Scanner;

public class ValoresAeB {
	public static void main(String[] args) {
		String A, B, C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem vindo caro usuario");
		System.out.println("Neste codigo, voce podera colocar dois caracteres, e eles serao trocados de ordem pelo codigo");
		System.out.print("Coloque o primeiro caractere: ");
		A = sc.nextLine();
		System.out.print("Coloque o segundo caractere: ");
		B = sc.nextLine();
		System.out.printf("Primeiro caractere: %s\n Segundo caractere: %s\n",A,B);
		System.out.println("Agora vamos trocar os valores de lugar");
		C = A;
		A = B;
		B = C;
		System.out.printf("Primeiro caractere: %s\n Segundo caractere: %s\n",A,B);
		sc.close();
	}

}
