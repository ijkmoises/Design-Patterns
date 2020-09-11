package strategy;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double retorno = impostoQualquer.calcula(orcamento);
		System.out.println(retorno);
	}
}
