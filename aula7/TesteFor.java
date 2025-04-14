package aula7;

import java.util.Scanner;

public class TesteFor {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double num1;

			System.out.println("Digite o numero 1: ");
			num1 = sc.nextDouble();

			for (int i = 1; i > 5; i++) {
				num1 = num1 * 2;
				System.out.printf("\n Resultado numero %d = %.2f ", i, num1);
			}
			sc.close();

		}
	}

