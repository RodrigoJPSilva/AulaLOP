package Exercicios2;

import java.util.Scanner;

public class LitrosPorMinuto {
	public static void main(String[] args) {
	//Variáveis
	Scanner sc = new Scanner(System.in);
	double Velocidade, Horas, Distancia,Litros_Usados;
	int Tempo;
	//Entrada
	System.out.print("Seja bem vindo caro usuario");
	System.out.println("Vamos calcular a quantidade de litros gastos na viagem de sua escolha");
	System.out.println("Um breve aviso: este codigo aceita somente numeros, agora avisado vamos adiante");
	System.out.print("Digite a velocidade media: ");
	Velocidade = sc.nextDouble();
	System.out.print("Agora digite os minutos percorridos: ");
	Tempo = sc.nextInt();
	Horas = Tempo / 60;
	
	//Processamento
	Distancia = Horas * Velocidade;
	Litros_Usados = Distancia / 12;	
	//Saída
	System.out.printf("Velocidade média: %.0fKM\n", Velocidade);
	if(Tempo >= 60) {
		if (Horas == 1){
			System.out.println("Tempo gasto: " + Horas +" Hora e " + Tempo % 60 + " Minutos");
		}
		else {
			System.out.println("Tempo gasto: " + Horas +" Horas e " + Tempo % 60 + " Minutos ");
		}
	}
	else {
	System.out.println("Tempo gasto: " + Tempo + " Minutos");
	}
	System.out.printf("Distância percorrida: %.0fKM\n", Distancia);
	System.out.printf("Litros gastos: %.0f Litros\n", Litros_Usados);
	System.out.print("Agradecemos a sua preferencia, volte sempre :)");
	sc.close();
	}
}
