package aula3;

import java.util.Scanner;

public class Conversao2{

			public static void main(String[] args) {
				// Abrindo o Scanner
				Scanner sc  = new Scanner(System.in);
				// Variaveis
				double fahrenheit,conversão;
				
				// Entrada
				System.out.println("Vamos converter Celsious para Fahrenheit");
				System.out.println("Digite os graus Celsious: ");
				fahrenheit = sc.nextDouble();
				
				// Processamento
				conversão = ((fahrenheit-32)* 5 / 9);
				
				// Saida
				System.out.printf("Em Fehrenheit são %.2f°F\n", conversão);

				// Fechando o Scanner
				sc.close();

			}



	}

