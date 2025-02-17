package aulas;

import java.util.Scanner;

public class Conversao3{

			public static void main(String[] args) {
				//Variaveis
				Scanner sc  = new Scanner(System.in);
				double VOLUME, R, ALTURA;
				
				//entrada
				System.out.println("Vamos calcular o volume");
				System.out.println("Digite o raio: ");
				R = sc.nextDouble();
				System.out.println("Digite a altura: ");
				ALTURA = sc.nextDouble();
				
				//processamento
				VOLUME = 3.14159 * (Math.pow(R,2)) * ALTURA;
				
				//saida
				System.out.printf("Em Fehrenheit são %.2fdm³\n", VOLUME);

				
				sc.close();

			}



	}

