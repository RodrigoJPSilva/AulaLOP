package aula2;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		// Criando o Scanner
		Scanner sc  = new Scanner(System.in);
		// Variaveis
		Double price, money, change;
		int unit

		// Entrada
		System.out.print("Preço unitário do produto: ");
		price = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		unit = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		money = sc.nextDouble();

		// Processamento
		change = money - price * unit;

		// Saida
		System.out.print("TROCO = ");
		System.out.println(String.format("%.2f", change));

		// Fechando o Scanner
		sc.close();
	}

}
