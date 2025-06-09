package aula8;

import java.util.Scanner;

public class EscolheVetor {
	public static void main(String[] args) {

//		int vetor[] = {1, 2};
//		for (int i = 1; i >= vetor.length-2; i--) {
//			System.out.printf("%d ",vetor[i]);
//	}
		int vetor[] = new int[5]; 
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero inteiro: ");
			vetor[i] = sc.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Os valores escolhidos foram: " + vetor[i]);
		}
		sc.close();
		}
}
