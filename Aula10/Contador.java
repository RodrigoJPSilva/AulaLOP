package Aula10;

import java.util.Scanner;

public class Contador {
	double cofre, saca, depos;
	Scanner sc = new Scanner(System.in);
	
	void setDepos(double depos) {
		try {
			System.out.println("Insira a quantidade a ser depositada");
			depos = sc.nextDouble();			
		} catch (Exception e) {
			System.out.println("Valor não reconhecido");
		}
	}
}
