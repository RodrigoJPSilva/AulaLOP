package aula4;

import java.util.Scanner;

public class TesteAprovacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota;
		String nome;
		System.out.println("Seja bem vindo caro usuario");
		System.out.printf("AVISO:Este codigo aceita somente numeros\nVamos ver se voce passou no texte\ninsira o seu nome: ");
	    nome = sc.nextLine();
	    System.out.printf("Agora insira a sua nota: \n");
	    nota = sc.nextDouble();
	    if (nota >= 7) {
	    	System.out.printf("O aluno %s tirou %.2f", nome, nota);
	    	System.out.print(" Aprovado");
	    }
	    else {
	    	System.out.printf("O aluno %s tirou reprovado %.2f", nome, nota);
	    	System.out.print(" Reprovado");
	    }
	    sc.close();
	}
}
