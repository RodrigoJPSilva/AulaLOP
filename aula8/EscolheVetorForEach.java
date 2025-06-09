package aula8;

import java.util.Scanner;

public class Aula8alternativo {
	public static void main(String[] args) {

//		int vetor[] = {1, 2};
//		for (int i = 1; i >= vetor.length-2; i--) {
//			System.out.printf("%d ",vetor[i]);
//	}
		int vetor[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i : vetor) {
			do {
				System.out.print("Digite um numero: ");
				vetor[i] = sc.nextInt();
			} while (i>=vetor.length);
			for (int j : vetor) {
				System.out.println("O resultado foi " + i);
			}
		}

		sc.close();
	}
}
