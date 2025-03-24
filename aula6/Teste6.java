package aula6;

import java.util.Scanner;

public class Teste6 {
	public static void main(String[] args) {
//		Declarando variaveis e o objeto
		Scanner sc = new Scanner(System.in);
		double numobj1, numobj2, numobj3, numobj4, numobj5, numdis1, numdis2, numdis3, numdis4, numdis5, mediaobj,
				mediadis;

//		Solicitando entradas
		System.out.println("Primeiro vamos ver as notas das provas objetivas: ");
		System.out.println("Digite a nota 1: ");
		numobj1 = sc.nextDouble();

		System.out.println("Digite a nota 2: ");
		numobj2 = sc.nextDouble();

		System.out.println("Digite a nota 3: ");
		numobj3 = sc.nextDouble();

		System.out.println("Digite a nota 4: ");
		numobj4 = sc.nextDouble();

		System.out.println("Digite a nota 5: ");
		numobj5 = sc.nextDouble();

		System.out.printf(
				"Aqui esta a nota das provas objetivas:\n Nota 1:%.2f \n Nota 2:%.2f \n Nota 3:%.2f \n Nota 4:%.2f"
						+ " \n Nota 5:%.2f \n",
				numobj1, numobj2, numobj3, numobj4, numobj5);

		System.out.println("Agora vamos ver as notas das provas discursivas: ");
		System.out.println("Digite a nota 1: ");
		numdis1 = sc.nextDouble();

		System.out.println("Digite a nota 2: ");
		numdis2 = sc.nextDouble();

		System.out.println("Digite a nota 3: ");
		numdis3 = sc.nextDouble();

		System.out.println("Digite a nota 4: ");
		numdis4 = sc.nextDouble();

		System.out.println("Digite a nota 5: ");
		numdis5 = sc.nextDouble();

		System.out.printf(
				"Aqui esta a nota das discussivas:\n Nota 1:%.2f \n Nota 2:%.2f \n Nota 3:%.2f \n Nota 4:%.2f \n Nota 5:%.2f \n",
				numdis1, numdis2, numdis3, numdis4, numdis5);

//		processamento
		mediaobj = (numobj1 + numobj2 + numobj3 + numobj4 + numobj5) / 5;
		mediadis = (numdis1 + numdis2 + numdis3 + numdis4 + numdis5) / 5;

		System.out.printf("Agora a média:\n Objetiva = %.2f \n Discursiva = %.2f", mediaobj, mediadis);

		sc.close();
	}
}
