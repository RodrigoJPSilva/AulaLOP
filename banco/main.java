package banco;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria b1 = new ContaBancaria();
		int res;

		b1.setSaldo(0.00);
		b1.consultaSaldo();
		System.out.println("O que deseja fazer?");
		res = sc.nextInt();
		switch (res) {
		case 1: {
			b1.consultaSaldo();
		}
		case 2: {
			b1.depositar(res);
		}
		case 3: {
			b1.sacar(res);
		}
		}
	}
}