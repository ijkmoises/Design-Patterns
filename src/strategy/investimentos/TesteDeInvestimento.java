package strategy.investimentos;

public class TesteDeInvestimento {
	public static void main(String[] args) {
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
		
		realizador.realiza(new Conta(300), new Conservador());
		
		
		realizador.realiza(new Conta(300), new Moderado());
		
		
		realizador.realiza(new Conta(300), new Arrojado());
	}
}
