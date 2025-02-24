package aula3;

import java.util.Scanner;

public class Prestação {

	public static void main(String[] args) {
		//Abrindo o Scanner
		Scanner sc  = new Scanner(System.in);
		//Variaveis
		double Prestacao, Valor, Taxa, Tempo;

		// entrada
		System.out.println("Seja bem vindo, caro usuario");
		System.out.println("Neste codigo, sera possivel verificar quanto voce pagara de juros em uma prestacao");
		System.out.println("AVISO: este codigo aceita somente numeros");
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
		//Fechando o Scanner
		sc.close();
	}

}
