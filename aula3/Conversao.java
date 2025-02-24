package aula3;

import java.util.Scanner;

public class Conversao{

			public static void main(String[] args) {
				//Abrindo o Scanner
				Scanner sc  = new Scanner(System.in);
				//Variaveis
				double Fahrenheit,Conversão;
				
				//entrada
				System.out.println("Vamos converter Fahreheit para Celsious");
				System.out.println("Digite os graus Celsious: ");
				Fahrenheit = sc.nextDouble();
				
				//processamento
				Conversão = Fahrenheit * 9 / 5 + 32;
				
				//saida
				System.out.printf("Em Celsious são %.2f°C\n", Conversão);

				//Fechando o Scanner
				sc.close();

			}



	}

