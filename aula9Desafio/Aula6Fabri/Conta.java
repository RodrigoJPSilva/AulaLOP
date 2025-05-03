package Aula6Fabri;

public class Conta {
	
	// Definir as variáveis: propriedades
	int numero;
	String titular;
	double saldo, limite;


	// Comportamentos da Conta
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	void deposita(double bufunfa) {
		this.saldo += bufunfa;
	}
}
	