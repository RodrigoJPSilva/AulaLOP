package aula3;

import java.util.Scanner;

public class LitrosPorMinuto {
	public static void main(String[] args) {
	// Abrindo o Scanner
	Scanner sc  = new Scanner(System.in);
	// Variaveis
	double velocidade, horasDouble, distancia,litrosUsados;
	int tempo;
	// Entrada
	System.out.print("Seja bem vindo caro usuario");
	System.out.println("Vamos calcular a quantidade de litros gastos na viagem de sua escolha");
	System.out.println("Um breve aviso: este codigo aceita somente numeros, agora avisado vamos adiante");
	System.out.print("Digite a velocidade media: ");
	velocidade = sc.nextDouble();
	System.out.print("Agora digite os minutos percorridos: ");
	tempo = sc.nextInt();
	// processamento	
	horasDouble = tempo / 60.0;// convertendo Tempo para double
	distancia = horasDouble * velocidade;
	litrosUsados = distancia / 12;
	int hrsInt = tempo / 60;
	int minInt = tempo % 60;
	// Saida Condicional
	System.out.printf("Velocidade média: %.0fKM\n", velocidade);
	if(tempo >= 60) {
		if (hrsInt == 1){
			System.out.printf("Tempo gasto: %d Hora e %d Minutos\n",hrsInt,minInt);
		} else {
			System.out.printf("Tempo gasto: %.0f Horas e %d Minutos\n",hrsInt,minInt);
		}
	} else {
	System.out.println("Tempo gasto: " + tempo + " Minutos");
	}
	// Saida
	System.out.printf("Distância percorrida: %.0fKM\n", distancia);
	System.out.printf("Litros gastos: %.0f Litros\n", litrosUsados);
	System.out.print("Agradecemos a sua preferencia, volte sempre :)");

	// Fechando o Scanner
	sc.close();
	}
}
