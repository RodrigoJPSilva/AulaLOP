package Exercicios2;

import java.util.Scanner;

public class Prestação {

	public static void main(String[] args) {
		// Variaveis
		double Prestacao, Valor, Taxa, Tempo;
		Scanner sc = new Scanner(System.in);
		// entrada
		System.out.println("Seja bem vindo, caro usuario");
		System.out.println("Neste codigo, sera possivel verificar quanto voce pagara de juros em uma prestacao");
		System.out.println("AVISO: este codigo aceita somente numeros.");
		System.out.print("Digite o valor da prestacao: ");
		Valor = sc.nextDouble();
		System.out.print("Agora digite a taxa da prestacao(porcentagem a ser cobrada): ");
		Taxa = sc.nextDouble();
		System.out.print("Agora digite o tempo em anos da prestacao: ");
		Tempo = sc.nextDouble();

		// processamento
		Prestacao = Valor + (Valor * (Taxa / 100) * Tempo);

		// saida
		System.out.printf("A sua prestacao sera de %.2f reais", Prestacao);
		sc.close();
	}

}
