package aula2;

import java.util.Scanner;

public class Quadro {

	public static void main(String[] args) {
		// Criando o Scanner
		Scanner sc  = new Scanner(System.in);
		// Variaveis
		Double height, width, area, perimeter, diagonal;

		// Entrada
		System.out.print("Largura do comodo: ");
		height = sc.nextDouble();
		System.out.print("Altura do Quadro: ");
		width = sc.nextDouble();
		
		// Processamento
		area = height * width;
		
		// Saida
		System.out.println("O valor em metros quadrados são: " + area);
		System.out.print("ÁREA = ");
		System.out.println(String.format("%.4f", area));
		Perimeter = 2 * (height+width);
		System.out.print("PEÍMETRO = ");
		System.out.println(String.format("%.4f", perimeter));
		Diagonal = Math.sqrt(height * height+width * width); 
		System.out.print("DIAGONAL = ");
		System.out.println(String.format("%.4f", diagonal));

		// Fechando o Scanner
		sc.close();

	}

}
