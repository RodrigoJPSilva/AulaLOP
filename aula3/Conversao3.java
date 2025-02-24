package aula3;

import java.util.Scanner;

public class Conversao3{

			public static void main(String[] args) {
				// Abrindo o Scanner
				Scanner sc  = new Scanner(System.in);
				// Variaveis
				double Volume, R, Altura;
				
				// Entrada
				System.out.println("Vamos calcular o volume");
				System.out.println("Digite o raio: ");
				R = sc.nextDouble();
				System.out.println("Digite a altura: ");
				Altura = sc.nextDouble();
				
				// Processamento
				Volume = 3.14159 * (Math.pow(R,2)) * Altura;
				
				// Saida
				System.out.printf("Em Fehrenheit são %.2fdm³\n", Volume);

				// Fechando o Scanner
				sc.close();

			}



	}

