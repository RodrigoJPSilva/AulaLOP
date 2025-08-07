package frutaSemArgumento;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res;
		Fruta frutas = new Fruta();
		
		System.out.println("  Olá, seja bem vindo a nossa loja magica!"
				+ "\nfale uma fruta que você deseja comer:");
//		armazenando nome
		res = sc.nextLine();
		frutas.setNome(res);
		
//		armazenando tipo
		System.out.println("Agora fale o tipo de fruta:");
		res = sc.nextLine();
		frutas.setTipo(res);
		
		System.out.println(frutas.getFruta());
		System.out.println(frutas.verificaEstadoFruta());
		System.out.println(frutas.comer());
		sc.close();
		
	}
}
