package chainOfResponsibility.requisicaoParaServidor;

public class Conta {
	
	private double saldo;
	private String titular;

	public Conta(String titular,double saldo) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
}
