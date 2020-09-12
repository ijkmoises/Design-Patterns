package strategy.impostos;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto novoImposto = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		
		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, novoImposto);

	}
}
