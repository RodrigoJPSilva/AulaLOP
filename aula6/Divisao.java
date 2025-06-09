package aula6;

import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        double num1,num2,divisao;

		        do {
		        System.out.println("Digite o numero 1: ");
		        num1 = sc.nextDouble();
		        System.out.println("Digite o numero 2: ");
		        num2 = sc.nextDouble();

		        divisao = num1 / num2;
		        }
		        while (num2 == 0);
		        
		            System.out.printf("Divisao:%.2f ",divisao);
		            
		        sc.close();
		    }
}


