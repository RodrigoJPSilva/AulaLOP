package aula6;

import java.util.Scanner;

public class Teste5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();



        if (num1 > 10 && num1 < 20) {
            System.out.printf("%.2f esta entre 10 e 20",num1); 
        } else if(num1 > 30 && num1 < 40) { 
        	System.out.printf("%.2f esta entre 30 e 40",num1); 
        } 
        sc.close();
    }
}
