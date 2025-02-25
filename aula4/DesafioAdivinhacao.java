package aula4;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {

	public static void main(String[] args) {
		// Objetos
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// Variaveis
		int rdNum, userNum, chances = 5;

		System.out.printf(
				"AVISO: Este codigo aceita somente numeros inteiros\nSeja bem vindo caro usuario\nNeste codigo, eu desafio voce a advinhar o numero que eu estou pensando\nescolha um numero de 0 a 100");

		// inicia um loop ate o acerto
		while (chances != 0) {
			// Define o numero aleatorio de 0 a 100
			rdNum = rd.nextInt(101);
			userNum = sc.nextInt();
			if (rdNum == userNum) {
				System.out.println("Parabens, voce acertou :)");
				break;
			} else if (userNum > 100 || userNum < 0) {
				chances--;
				System.out.printf("Infelizmente voce nao escolheu um numero invalido\nRestam %d chances, tente novamente:",chances);
			} else {
				chances--;
				System.out.printf("Voce errou\\nRestam %d chances, tente novamente: :(",chances);
			}
			
		}
		System.out.println("Fim de jogo");
	}
}
