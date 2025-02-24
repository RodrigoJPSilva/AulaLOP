package aula2;

import java.util.Scanner;

public class Quadro {

	public static void main(String[] args) {
		//Criando o Scanner
		Scanner sc  = new Scanner(System.in);
		//Variaveis
		Double Height, Width, Area, Perimeter, Diagonal;

		//Entrada
		System.out.print("Largura do comodo: ");
		Height = sc.nextDouble();
		System.out.print("Altura do Quadro: ");
		Width = sc.nextDouble();
		
		//Processamento
		Area = Height * Width;
		
		//Saida
		System.out.println("O valor em metros quadrados são: " + Area);
		System.out.print("ÁREA = ");
		System.out.println(String.format("%.4f", Area));
		Perimeter = 2 * (Height+Width);
		System.out.print("PEÍMETRO = ");
		System.out.println(String.format("%.4f", Perimeter));
		Diagonal = Math.sqrt(Height * Height+Width * Width); 
		System.out.print("DIAGONAL = ");
		System.out.println(String.format("%.4f", Diagonal));
		
		sc.close();

	}

}
