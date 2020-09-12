package strategy.investimentos;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
    public void deposita(double valor) {
        this.saldo += valor;
      }

	public double getSaldo() {
		return saldo;
	}
}
