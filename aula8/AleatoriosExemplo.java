package aula8;

import java.util.Scanner;

import java.util.Random;

public class AleatorioExemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int verificador = 0;
		int vetor[] = new int[8];
		int min[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(9);
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Os valores escolhidos foram: " + vetor[i]);
		}
		sc.close();
	}
}
