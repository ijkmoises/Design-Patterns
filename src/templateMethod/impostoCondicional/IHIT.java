package templateMethod.impostoCondicional;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {
	
	/*
	 	Crie o imposto IHIT, que tem a seguinte regra: caso existam 2 
	 	itens com o mesmo nome, o imposto deve ser de 13% mais R$100,00.

		Caso contrário, o valor do imposto deverá ser (1% * o número de ítens no orçamento).
	 * */
	
	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		List<String> noOrcamento = new ArrayList<String>();
		
        for(Item item : orcamento.getItens()) {
            if(noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        }
        
        return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.0;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) + orcamento.getItens().size();
	}

}
