package aula3;

import java.util.Scanner;

public class Conversao3{

			public static void main(String[] args) {
				// Abrindo o Scanner
				Scanner sc  = new Scanner(System.in);
				// Variaveis
				double volume, r, altura;
				
				// Entrada
				System.out.println("Vamos calcular o volume");
				System.out.println("Digite o raio: ");
				r = sc.nextDouble();
				System.out.println("Digite a altura: ");
				altura = sc.nextDouble();
				
				// Processamento
				volume = 3.14159 * (Math.pow(r,2)) * altura;
				
				// Saida
				System.out.printf("Em Fehrenheit são %.2fdm³\n", volume);

				// Fechando o Scanner
				sc.close();

			}



	}

