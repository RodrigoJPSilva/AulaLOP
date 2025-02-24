package Aula4;

import java.util.Scanner;

public class MaiorMenor2 {

	public static void main(String[] args) {
		//Variaveis
		Scanner sc = new Scanner(System.in);
		double a,b;
		
		//Entrada
		System.out.println("Seja bem vindo caro usuario");
		System.out.println("Digite dois numeros e eu lhe direi qual deles e maior");
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o segundo numero:");
		b = sc.nextDouble();
		
		//Processamento e Saida
		if (a>b) {
			System.out.printf("%.2f é maior que %.2f",a,b);
		}
		else {
			System.out.printf("%.2f é maior que %.2f",a,b);
		}
		sc.close();
	}

}
