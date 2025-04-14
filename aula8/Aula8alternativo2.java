package aula8;

import java.util.Scanner;
import java.util.Random;

public class Aula8alternativo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int soma = 0;
		int vetor[] = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(100);
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Os valores escolhidos foram: " + vetor[i]);
			soma += vetor[i];
			
		}
		System.out.println("O resultado foi " + soma);
		
		sc.close();
		}
}