package aula3;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// Abrindo o Scanner
		Scanner sc  = new Scanner(System.in);
		// Variaveis
		double peso,altura, imc;
		
		// Entrada
		System.out.println("Vamos ver o seu Indíce de Massa Muscular ");
		System.out.println("Digite o seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		// Processamento
		imc = peso / (Math.pow(altura, 2));
		System.out.printf("IMC = %.2f\n", imc);
		
		// Saida
		if (imc < 18.5) {
			System.out.println("Você está abaixo o do peso");
		} else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Você está no peso ideal");
		} else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Você está com sobrepeso");
		} else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Você está com obesidade grau 1");
		} else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Você está com obesidade grau 2");
		} else if(imc >= 40) {
			System.out.println("Você está com obesidade grau 3");
		}

		// Fechando o Scanner
		sc.close();

	}

}
