package desafioRetanguloEstrutural;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alt[] = new double[3];
		double base[] = new double[3];
		double area[] = new double[3];
		for (int i = 0; i < 2; i++) {				
				System.out.printf("Insira a altura do %d° retângulo", i);
				alt[i] = sc.nextDouble();
				System.out.printf("Insira a base do %d° retângulo", i);
				base[i] = sc.nextDouble();
				area[i] = base[i] * alt[i];
				System.out.println(area[i]);				
				System.out.println("Retangulo [area=" + area[i] + ", base=" + base[i] + ", alt=" + alt[i] + "]");
			}
		}	
	}
