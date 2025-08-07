package Ex1GetSet;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();

		System.out.println("Seja bem vindo, insira seu nome de usuário");
		p1.setNome(sc.nextLine());
//		System.out.println(p1.getNome());
		
		System.out.println("Insira a sua idade");
		p1.setIdade(sc.nextInt());	

//		System.out.println(p1.getIdade());
		
		System.out.println("Seu nome e idade são: \n" + p1.toString());
		sc.close();
	}
}
