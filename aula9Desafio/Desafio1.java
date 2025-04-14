package aula9Desafio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
/*		[0] Salário Bruto, [1] Número de dependentes, [2] plano de saúde,
		[3] Vale Transporte , [4] Vale Alimentação 
		[5] Vale Refeição */
		double vetor[] = new double[6];
		char resposta;
		
		System.out.println("Seja bem vindo caro usuário");
		System.out.print("Insira o salário bruto");
		vetor[0] = sc.nextDouble();
		System.out.print("Tem dependentes? [s/n]");
		resposta = sc.next().toUpperCase().charAt(0);
	
		switch (resposta) {
		case 'S':
			System.out.println("Insira o valor do seu vale: ");
			vetor[1] = sc.nextDouble();
			
			break;

		default:

			break;
		}
		System.out.print("Tem plano de saúde? [s/n]");
		resposta = sc.next().toUpperCase().charAt(0);
		
		switch (resposta) {
		case 'S':
			System.out.println("Insira o valor do seu vale: ");
			vetor[1] = sc.nextDouble();
			
			break;
			
		default:
			
			break;
		}
		System.out.print("Recebe vale transporte: [s/n]");
		resposta = sc.next().toUpperCase().charAt(0);
		
		switch (resposta) {
		case 'S':
			System.out.println("Insira o valor do seu vale: ");
			vetor[1] = sc.nextDouble();
			
			break;
			
		default:
			
			break;
		}
		System.out.print("Recebe vale alimentação: [s/n]");
		resposta = sc.next().toUpperCase().charAt(0);
		
		switch (resposta) {
		case 'S':
			System.out.println("Insira o valor do seu vale: ");
			vetor[1] = sc.nextDouble();
			
			break;
			
		default:
			
			break;
		}
		System.out.print("Recebe vale refeição: [s/n]");
		resposta = sc.next().toUpperCase().charAt(0);
		
		switch (resposta) {
		case 'S':
			System.out.println("Insira o valor do seu vale: ");
			vetor[1] = sc.nextDouble();
			
			break;
			
		default:
			
			break;
		}
		System.out.println("Insira o valor  ");
		vetor[1] = sc.nextDouble();
		

	}

}
