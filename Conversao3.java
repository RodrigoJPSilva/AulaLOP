package aulas;

import java.util.Scanner;

public class Conversao3{

			public static void main(String[] args) {
				//Variaveis
				Scanner sc  = new Scanner(System.in);
				double Volume, R, Altura;
				
				//entrada
				System.out.println("Vamos calcular o volume");
				System.out.println("Digite o raio: ");
				R = sc.nextDouble();
				System.out.println("Digite a altura: ");
				Altura = sc.nextDouble();
				
				//processamento
				Volume = 3.14159 * (Math.pow(R,2)) * Altura;
				
				//saida
				System.out.printf("Em Fehrenheit são %.2fdm³\n", Volume);

				
				sc.close();

			}



	}

