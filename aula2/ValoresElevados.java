package aula2;

import java.util.Scanner;

public class ValoresElevados {

	public static void main(String[] args) {
		// Criando o Scanner
		Scanner sc  = new Scanner(System.in);
		// Variaveis
		Double height, width, area, price, total;

		// Entrada
		System.out.print("Digite a largura do cômodo: ");
		height = sc.nextDouble();
		System.out.print("Digite o comprimento do comodo: ");
		width = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado do piso: ");
		price = sc.nextDouble();
		
		// Processamento
		area = height * width;
		total = price * area;

		// Saida
		System.out.println("O valor em metros quadrados são: " + area);
		System.out.print("O valor do seu produto é: ");
		System.out.print(String.format("%.2f", total));

		// Fechando o Scanner
		sc.close();

	}

}
