package aula6;

import java.util.Scanner;

public class ValidadorDeCPF {
	public static void main(String[] args) {
//		Declarando variaveis e o objeto
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4, num5, num6, num7, num8, num9,num10,total,resto;

//		Solicitando entradas
		System.out.println("Primeiro vamos ver as notas das provas objetivas: ");
		System.out.println("Digite o primeiro: ");
		num1 = sc.nextDouble();

		System.out.println("Digite a segundo: ");
		num2 = sc.nextDouble();

		System.out.println("Digite a terceiro: ");
		num3 = sc.nextDouble();

		System.out.println("Digite a quarto: ");
		num4 = sc.nextDouble();

		System.out.println("Digite a quinto: ");
		num5 = sc.nextDouble();
		
		System.out.println("Digite a sexto: ");
		num6 = sc.nextDouble();

		System.out.println("Digite a setimo: ");
		num7 = sc.nextDouble();

		System.out.println("Digite a oitavo: ");
		num8 = sc.nextDouble();
		
		System.out.println("Digite a nono: ");
		num9 = sc.nextDouble();
		
		total = (num1 * 10) + (num2 * 9) + (num3 * 8) + (num4 * 7) + (num5 * 6) + (num6 * 5) + (num7 * 4) + (num8 * 3) + (num9 * 2);
		resto = total % 11;
		total = 11 - resto;
		if (total == num9) {
			System.out.println("Verificado e aprovado!");			
		} else {
			System.out.println("Verificado e recusado! cpf falso");						
		}
		
		System.out.println("Primeiro vamos ver as notas das provas objetivas: ");
		System.out.println("Digite o primeiro: ");
		num1 = sc.nextDouble();

		System.out.println("Digite a segundo: ");
		num2 = sc.nextDouble();

		System.out.println("Digite a terceiro: ");
		num3 = sc.nextDouble();

		System.out.println("Digite a quarto: ");
		num4 = sc.nextDouble();

		System.out.println("Digite a quinto: ");
		num5 = sc.nextDouble();
		
		System.out.println("Digite a sexto: ");
		num6 = sc.nextDouble();

		System.out.println("Digite a setimo: ");
		num7 = sc.nextDouble();

		System.out.println("Digite a oitavo: ");
		num8 = sc.nextDouble();
		
		System.out.println("Digite a nono: ");
		num9 = sc.nextDouble();
		
		System.out.println("Digite a dez: ");
		num10 = sc.nextDouble();

		total = (num1 * 11) + (num2 * 10) + (num3 * 9) + (num4 * 8) + (num5 * 7) + (num6 * 6) + (num7 * 5) + (num8 * 4) + (num9 * 3) + (num10 * 2);
		resto = total % 11;
		total = total - resto;
		if (total == num10) {
			System.out.println("Verificado e aprovado!");			
		} else {
			System.out.println("Verificado e recusado! cpf falso");						
		}
	}}
		
		
		
		
	