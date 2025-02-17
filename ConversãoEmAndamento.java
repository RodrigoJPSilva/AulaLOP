package aulas;

import java.util.Scanner;

public class ConversãoEmAndamento {
	public static void main(String[] args) {
	//Variaveis
	Scanner sc = new Scanner(System.in);
	double VELOCIDADE, HORAS, DISTANCIA,LITROS_USADOS;
	int TEMPO;
	//Entrada
	System.out.print("Seja bem vindo caro usuário!");
	System.out.println("Vamos calcular a sua quantidade de litros gastos na viagem de sua escolha");
	System.out.println("Digite a velocidade media");
	VELOCIDADE = sc.nextDouble();
	System.out.println("Digite os minutos percorridos");
	TEMPO = sc.nextInt();
	HORAS = (double) TEMPO / 60;
	
	//Processamento
	DISTANCIA = HORAS * VELOCIDADE;
	LITROS_USADOS = DISTANCIA / 12;
	
	//Saída
	System.out.printf("Velocidade média: %.0fKM\n", VELOCIDADE);
	if(TEMPO >= 60) {
	System.out.println("Tempo gasto: " + HORAS +" Horas");
	}
	else {
	System.out.println("Tempo gasto: " + TEMPO + " Minutos");
	}
	System.out.printf("Distância percorrida: %.0fKM\n", DISTANCIA);
	System.out.printf("Litros gastos: %.0f Litros\n", LITROS_USADOS);
	System.out.print("Agradecemos a sua preferência, volte sempre :)");
	
	}
}
