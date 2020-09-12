package strategy.investimentos;

public class RealizadorDeInvestimentos {
	
    public void realiza(Conta conta, InvestimentoStrategy investimento) {
        double resultado = investimento.calcula(conta);

        conta.deposita( resultado * 0.75 );
        System.out.println ( "Novo saldo: " + conta.getSaldo());
      }

}
