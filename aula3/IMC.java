package aula3;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// Abrindo o Scanner
		Scanner sc  = new Scanner(System.in);
		// Variaveis
		double Peso,Altura, IMC;
		
		// Entrada
		System.out.println("Vamos ver o seu Indíce de Massa Muscular ");
		System.out.println("Digite o seu peso: ");
		Peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		Altura = sc.nextDouble();
		
		// Processamento
		IMC = Peso / (Math.pow(Altura, 2));
		System.out.printf("IMC = %.2f\n", IMC);
		
		// Saida
		if (IMC < 18.5) {
			System.out.println("Você está abaixo o do peso");
		}
		else if(IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("Você está no peso ideal");
		}
		else if(IMC >= 25 && IMC <= 29.9) {
			System.out.println("Você está com sobrepeso");
		}
		else if(IMC >= 30 && IMC <= 34.9) {
			System.out.println("Você está com obesidade grau 1");
		}
		else if(IMC >= 35 && IMC <= 39.9) {
			System.out.println("Você está com obesidade grau 2");
		}
		else if(IMC >= 40) {
			System.out.println("Você está com obesidade grau 3");
		}

		// Fechando o Scanner
		sc.close();

	}

}
