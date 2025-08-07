package banco;

public class ContaBancaria {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void consultaSaldo() {
		System.out.println("Seu saldo atual é de: R$" + saldo);
	}
	public void depositar(double deposito) {
		saldo += deposito;
	}
	public void sacar(double saque) {
		saldo -= saque;		
	}
	public void consultar() {
		System.out.println("Seu saldo é de" + saldo);
	}
}	
