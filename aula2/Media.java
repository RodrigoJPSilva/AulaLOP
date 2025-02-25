package aula2;

import java.util.Scanner;

public class Média {
		public static void main(String[] args) {
			// Criando o Scanner
			Scanner sc  = new Scanner(System.in);
			// Variaveis
			String nome1, nome2;
			double alt1, alt2,  media;
			
			// Dados primeira pessoa
			System.out.println("Dados da primeira pessoa: ");
			System.out.print("Nome: ");
			nome1 = sc.nextLine();
			System.out.print("Altura: ");
			alt1 = sc.nextDouble();
			
			sc.nextLine();
		
			// Dados segunda pessoa
			System.out.println("Dados da segunda pessoa: ");
			System.out.print("Nome: ");
			nome2 = sc.nextLine();
			System.out.print("Altura: ");
			alt2 = sc.nextDouble();

			// Processamento
			media = (Alt1+Alt2) / 2;

			// Saida
			System.out.println("A altura média de "+ nome1 + "e " + nome2 + "são" + media);
			
			// Fechando o Scanner
			sc.close();

		}

	}
