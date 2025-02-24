package aula4;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// Abrindo o Scanner
		Scanner sc = new Scanner(System.in);
		// Variaveis
		int ano;
		System.out.printf("Seja bem vindo caro usuario\nVenha testar meu codigo e descobrir um ano bissexto\nAVISO:Esse codigo aceita somente numeros\n");
		System.out.printf("Insira o ano:");
		ano = sc.nextInt();
	    
		// Saida Condicional
		if ((ano % 4 == 0 && ano % 100 != 0)||(ano % 400 == 0)) {
			System.out.printf("O ano %d e bissexto",ano);
		}
		else {
			System.out.printf("O ano %d nao e bissexto",ano);			
		}
		// Fechando o Scanner
		sc.close();
	}

}
