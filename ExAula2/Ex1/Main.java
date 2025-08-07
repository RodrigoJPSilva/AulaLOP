package Ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		System.out.println("Seja bem vindo, insira seu nome de usuário");
		p1.setNome(sc.nextLine());
//		System.out.println(p1.getNome());
		do {
		System.out.println("Insira a sua idade");
		}	
		while(p1.verifica(sc.nextInt()) == true);

//		System.out.println(p1.getIdade());
		
		System.out.println("Seu nome e idade são: \n" + p1.toString());
		sc.close();
	}
}
