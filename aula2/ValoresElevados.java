package aula2;

import java.util.Scanner;

public class ValoresElevados {

	public static void main(String[] args) {
		//Criando o Scanner
		Scanner sc  = new Scanner(System.in);
		//Variaveis
		Double Height, Width, Area, Price, Total;

		//Entrada
		System.out.print("Digite a largura do cômodo: ");
		Height = sc.nextDouble();
		System.out.print("Digite o comprimento do comodo: ");
		Width = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado do piso: ");
		Price = sc.nextDouble();
		
		//Processamento
		Area = Height * Width;
		Total = Price * Area;

		//Saida
		System.out.println("O valor em metros quadrados são: " + Area);
		System.out.print("O valor do seu produto é: ");
		System.out.print(String.format("%.2f", Total));

		//Fechando o Scanner
		sc.close();

	}

}
