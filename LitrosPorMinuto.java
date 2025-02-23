package Exercicios2;

import java.util.Scanner;

public class LitrosPorMinuto {
	public static void main(String[] args) {
	//Variáveis
	Scanner sc = new Scanner(System.in);
	double VELOCIDADE, HORAS, DISTANCIA,LITROS_USADOS;
	int TEMPO;
	//Entrada
	System.out.print("Seja bem vindo caro usuario");
	System.out.println("Vamos calcular a quantidade de litros gastos na viagem de sua escolha");
	System.out.println("Um breve aviso: este codigo aceita somente numeros, agora avisado vamos adiante");
	System.out.print("Digite a velocidade media: ");
	VELOCIDADE = sc.nextDouble();
	System.out.print("Agora digite os minutos percorridos: ");
	TEMPO = sc.nextInt();
	HORAS = TEMPO / 60;
	
	//Processamento
	DISTANCIA = HORAS * VELOCIDADE;
	LITROS_USADOS = DISTANCIA / 12;
	
	//Saída
	System.out.printf("Velocidade média: %.0fKM\n", VELOCIDADE);
	if(TEMPO >= 60) {
		if (HORAS == 1){
			System.out.println("Tempo gasto: " + HORAS +" Hora e " + TEMPO % 60 + " Minutos");
		}
		else {
			System.out.println("Tempo gasto: " + HORAS +" Horas e " + TEMPO % 60 + " Minutos ");
		}
	}
	else {
	System.out.println("Tempo gasto: " + TEMPO + " Minutos");
	}
	System.out.printf("Distância percorrida: %.0fKM\n", DISTANCIA);
	System.out.printf("Litros gastos: %.0f Litros\n", LITROS_USADOS);
	System.out.print("Agradecemos a sua preferência, volte sempre :)");
	sc.close();
	}
}
