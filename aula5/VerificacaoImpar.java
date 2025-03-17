package aula5;

import java.util.Scanner;

public class VerificacaoImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, res;
		System.out.printf("Seja bem vindo caro usario\nInsira um numero inteiro e eu lhe direi se e par ou impar:");
		i = sc.nextInt();
		while (i == 0) {
			System.out.println("Numero do usuario " + i);
			System.out.println("Seu numero e nulo");
		}
		res = i % 2;
		if (res == 0) {
			System.out.println("Numero do usuario " + i);
			System.out.println("Seu numero e par");
		} else {
			System.out.println("Numero do usuario " + i);
			System.out.println("Seu numero e impar");
		}
		sc.close();
	}

}
