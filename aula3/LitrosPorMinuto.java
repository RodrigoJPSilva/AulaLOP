package aula3;

import java.util.Scanner;

public class LitrosPorMinuto {
	public static void main(String[] args) {
	//Variáveis
	Scanner sc = new Scanner(System.in);
	double Velocidade, HorasDouble, Distancia,Litros_Usados;
	int Tempo;
	//Entrada
	System.out.print("Seja bem vindo caro usuario");
	System.out.println("Vamos calcular a quantidade de litros gastos na viagem de sua escolha");
	System.out.println("Um breve aviso: este codigo aceita somente numeros, agora avisado vamos adiante");
	System.out.print("Digite a velocidade media: ");
	Velocidade = sc.nextDouble();
	System.out.print("Agora digite os minutos percorridos: ");
	Tempo = sc.nextInt();
    //processamento	
	HorasDouble = Tempo / 60.0;//convertendo Tempo para double
	Distancia = HorasDouble * Velocidade;
	Litros_Usados = Distancia / 12;
	int HrsInt = Tempo / 60;
	int MinInt = Tempo % 60;
	//Saída
	System.out.printf("Velocidade média: %.0fKM\n", Velocidade);
	if(Tempo >= 60) {
		if (HrsInt == 1){
			System.out.printf("Tempo gasto: %d Hora e %d Minutos\n",HrsInt,MinInt);
		}
		else {
			System.out.printf("Tempo gasto: %.0f Horas e %d Minutos\n",HrsInt,MinInt);
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
