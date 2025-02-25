package aula3;

import java.util.Scanner;

public class Conversao{

			public static void main(String[] args) {
				// Abrindo o Scanner
				Scanner sc  = new Scanner(System.in);
				// Variaveis
				double fahrenheit,conversão;
				
				// Entrada
				System.out.println("Vamos converter Fahreheit para Celsious");
				System.out.println("Digite os graus Celsious: ");
				fahrenheit = sc.nextDouble();
				
				// Processamento
				conversão = Fahrenheit * 9 / 5 + 32;
				
				// Saida
				System.out.printf("Em Celsious são %.2f°C\n", conversão);

				// Fechando o Scanner
				sc.close();

			}



	}

