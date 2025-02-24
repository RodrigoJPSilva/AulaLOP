package aula2;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		//Criando o Scanner
		Scanner sc  = new Scanner(System.in);
		//Variaveis
		Double Price, Money, Change;
		int Unit

		//Entrada
		System.out.print("Preço unitário do produto: ");
		Price = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		Unit = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		Money = sc.nextDouble();

		//Processamento
		Change = Money - Price * Unit;

		//Saida
		System.out.print("TROCO = ");
		System.out.println(String.format("%.2f", Change));
	}

}
