package aula5;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, mul = 1;
		System.out.printf("Seja bem vindo caro usario\nInsira um numero inteiro e irei passar uma tabuada dele:");
		i = sc.nextInt();
		do {
			System.out.println(i + " * " + mul + " = " + (i * mul));
			mul++;
		} while (mul <= 10);

	}

}
