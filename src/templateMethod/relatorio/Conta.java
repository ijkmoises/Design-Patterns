package templateMethod.relatorio;

public class Conta {
	private double saldo;
	private Banco banco;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(Banco banco) {
		this.banco = banco;
	}
	
    public void deposita(double valor) {
        this.saldo += valor;
      }

	public double getSaldo() {
		return saldo;
	}

	public Banco getBanco() {
		return banco;
	}
}
