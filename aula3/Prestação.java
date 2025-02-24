package aula3;

import java.util.Scanner;

public class Prestação {

	public static void main(String[] args) {
		// Abrindo o Scanner
		Scanner sc  = new Scanner(System.in);
		// Variaveis
		double prestacao, valor, taxa, tempo;

		// entrada
		System.out.println("Seja bem vindo, caro usuario");
		System.out.println("Neste codigo, sera possivel verificar quanto voce pagara de juros em uma prestacao");
		System.out.println("AVISO: este codigo aceita somente numeros");
		System.out.print("Digite o valor da prestacao: ");
		valor = sc.nextDouble();
		System.out.print("Agora digite a taxa da prestacao(porcentagem a ser cobrada): ");
		taxa = sc.nextDouble();
		System.out.print("Agora digite o tempo em anos da prestacao: ");
		tempo = sc.nextDouble();

		// processamento
		prestacao = valor + (valor * (taxa / 100) * tempo);

		// saida
		System.out.printf("A sua prestacao sera de %.2f reais", prestacao);
		// Fechando o Scanner
		sc.close();
	}

}
