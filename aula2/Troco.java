package aula2;

import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		Double Price, Money, Change;
		int Unit
		System.out.print("Preço unitário do produto: ");
		Price = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		Unit = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		Money = sc.nextDouble();
		
		Change = Money - Price * Unit;
		
		System.out.print("TROCO = ");
		System.out.println(String.format("%.2f", Change));
	}

}
