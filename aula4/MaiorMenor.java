package aula4;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		//Variaveis
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		
		//Entrada
		System.out.println("Seja bem vindo caro usuario");
		System.out.println("Digite dois numeros e eu lhe direi qual deles e maior");
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o segundo numero:");
		b = sc.nextDouble();
		
		System.out.print("Digite o segundo numero:");
		c = sc.nextDouble();
		
		//Processamento e Saida
		
		if (a<=b && a<=c) {
			if (b<c) {
				System.out.printf("Veja a ordem crescente dos numeros recebidos:%.2f, %.2f e %.2f",a,b,c);
			}
			else {
				System.out.printf("Veja a ordem crescente dos numeros recebidos:%.2f, %.2f e %.2f",a,c,b);	
			}
		}
		if (c<=a && c<=b) {
			if (b<a) {
				System.out.printf("Veja a ordem crescente dos numeros recebidos:%.2f, %.2f e %.2f",c,b,a);
			}
			else {
				System.out.printf("Veja a ordem crescente dos numeros recebidos:%.2f, %.2f e %.2f",c,a,b);				
			}
		}
		if (b<=a && b<=c) {
			if (c<a) {
				System.out.printf("Veja a ordem crescente dos numeros recebidos:%.2f, %.2f e %.2f",b,c,a);
			}
			else {
				System.out.printf("Veja a ordem crescente dos numeros recebidos:%.2f, %.2f e %.2f",b,a,c);				
			}
		}
		
		sc.close();
	}
	
}
