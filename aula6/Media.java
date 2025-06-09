package aula6;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        double num1,num2,num3,media;

		        System.out.println("Digite a nota 1: ");
		        num1 = sc.nextDouble();

		        System.out.println("Digite a nota 2: ");
		        num2 = sc.nextDouble();

		        System.out.println("Digite a nota 3: ");
		        num3 = sc.nextDouble();

		        media = (num1 + num2 + num3) / 3;

		        if (media >= 7) {
		            System.out.println("Aprovado!"); 
		        } else { 
		            System.out.println("Reprovado! Média: " + media);
		        }
		        sc.close();
		    }
}


