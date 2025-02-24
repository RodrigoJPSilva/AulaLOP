package aula4;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// Variaveis
		Scanner sc = new Scanner(System.in);
		double num;

		// Entrada
		System.out.println("Seja bem vindo caro usuario");
		System.out.println("Vamos ver o valor do numero de sua escolha. positivo, negativo ou neutro");

		System.out.print("Digite o primeiro numero: ");
		num = sc.nextDouble();

		// Processamento e Saida

		if (num < 0) {
			System.out.print("O seu numero e negativo");
		}
		else if (num == 0) {
			System.out.print("O seu numero e neutro");
		}
		else {
			System.out.print("O seu numero e positivo");
		}
		sc.close();
	}
}
