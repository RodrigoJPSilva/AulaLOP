package Aula10;

import java.util.Scanner;

public class CofreInteligente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// [0] poupança semanal [1] deposita [2] meta
		double cofre[] = new double[3];
		double val[] = {0.01,0.05,0.10,0.25,0.50,1.00};
		int moeda = 0;
		double meta = 0;
		int semana = 7;

		System.out.println("Seja bem vindo ao nosso banco\n Agradecemos a sua preferência");
		System.out.print("Insira a meta a ser alcançada:");
		meta = sc.nextDouble();

		System.out.println("Insira um numero a seguir para a moeda que será depositada por semana"
				+ "depositada, ou digite 0 para finalizar o depósito:"
				+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
				+ "\n5- 0,50 centavos\n6-1 real");
		do {
			moeda = sc.nextInt();
			switch (moeda) {
		case 1:
			System.out.printf("0,01 centavos inseridos, valor atual: %.2f",cofre[0]);
			cofre[0] += val[0];
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.println("Insira mais uma moeda ou finalize pressionando [0]"
					+ "depositada, ou digite 0 para finalizar o depósito:"
					+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
					+ "\n5- 0,50 centavos\n6-1 real");
			continue;
		case 2:
			System.out.printf("0,01 centavos inseridos, valor atual: %.2f",cofre[0]);
			cofre[0] += val[1];
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.println("Insira mais uma moeda ou finalize pressionando [0]"				
					+ "depositada, ou digite 0 para finalizar o depósito:"
					+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
					+ "\n5- 0,50 centavos\n6-1 real");
			continue;
		case 3:
			System.out.printf("0,01 centavos inseridos, valor atual: %.2f",cofre[0]);
			cofre[0] += val[2];
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.println("Insira mais uma moeda ou finalize pressionando [0]"				
					+ "depositada, ou digite 0 para finalizar o depósito:"
					+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
					+ "\n5- 0,50 centavos\n6-1 real");
			continue;
		case 4:
			System.out.printf("0,01 centavos inseridos, valor atual: %.2f",cofre[0]);
			cofre[0] += val[3];
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.println("Insira mais uma moeda ou finalize pressionando [0]"			
					+ "depositada, ou digite 0 para finalizar o depósito:"
					+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
					+ "\n5- 0,50 centavos\n6-1 real");
			continue;
		case 5:
			System.out.printf("0,01 centavos inseridos, valor atual: %.2f",cofre[0]);
			cofre[0] += val[4];
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.println("Insira mais uma moeda ou finalize pressionando [0]"				
					+ "depositada, ou digite 0 para finalizar o depósito:"
					+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
					+ "\n5- 0,50 centavos\n6-1 real");
			continue;
		case 6:
			System.out.printf("0,01 centavos inseridos, valor atual: %.2f",cofre[0]);
			cofre[0] += val[5];
			System.out.printf("Novo valor no cofre: %.2f",cofre[0]);
			System.out.println("Insira mais uma moeda ou finalize pressionando [0]"		
					+ "depositada, ou digite 0 para finalizar o depósito:"
					+ "\n 1-0,01 centavo\n2-0,05 centavos\n3-0,10 centavos\n4- 0,25 centavos"
					+ "\n5- 0,50 centavos\n6-1 real");
			continue;
		default:
			System.out.println("Finalizando depósito");
			}
			break;
		}
		
		while(true);
		System.out.println("Meta alcançada");
	}
}
