package aula3;

import java.util.Scanner;

public class Conversao2{

			public static void main(String[] args) {
				//Abrindo o Scanner
				Scanner sc  = new Scanner(System.in);
				//Variaveis
				double Fahrenheit,Conversão;
				
				//entrada
				System.out.println("Vamos converter Celsious para Fahrenheit");
				System.out.println("Digite os graus Celsious: ");
				Fahrenheit = sc.nextDouble();
				
				//processamento
				Conversão = ((Fahrenheit-32)* 5 / 9);
				
				//saida
				System.out.printf("Em Fehrenheit são %.2f°F\n", Conversão);

				//Fechando o Scanner
				sc.close();

			}



	}

