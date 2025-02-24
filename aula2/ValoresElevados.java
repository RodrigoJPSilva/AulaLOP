package aula2;

import java.util.Scanner;

public class ValoresElevados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Double Height, Width, Area, Price, Total;

		System.out.print("Digite a largura do cômodo: ");
		Height = sc.nextDouble();

		System.out.print("Digite o comprimento do comodo: ");
		Width = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado do piso: ");
		Price = sc.nextDouble();
		

		Area = Height * Width;
		

		System.out.println("O valor em metros quadrados são: " + Area);
		
		Total = Price * Area;
		
		System.out.print("O valor do seu produto é: ");
		System.out.print(String.format("%.2f", Total));
		

		sc.close();

	}

}
