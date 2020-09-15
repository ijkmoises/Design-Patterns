package templateMethod.impostoCondicional;

/**
* 
* Implemente o Template Method para resolver o problema dos impostos.
*
* Implemente os Impostos ICPP e IKCV.
*
* O imposto ICPP é calculado da seguinte forma: caso o valor do orçamento 
* seja menor que 500,00, deve-se cobrar 5%; caso contrário, 7%.
*
* Já o imposto IKCV, caso o valor do orçamento seja maior que 500,00 e algum 
* item tiver valor superior a 100,00, o imposto a ser cobrado é de 10%; caso contrário 6%.
*
* Escreva um método main que testa sua implementação.
*
 */

public class TestaTemplateMethod {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("BOLA",300));
		orcamento.adicionaItem(new Item("BOLA",300));
		orcamento.adicionaItem(new Item("TENIS",88));
		orcamento.adicionaItem(new Item("CAMISETA",600));

		ICPP impostoICPP = new ICPP();
		double calculoICPP = impostoICPP.calcula(orcamento);
		System.out.println(calculoICPP);
		
		IKCV impostoICKV = new IKCV();
		double calculoIKCV = impostoICKV.calcula(orcamento);
		System.out.println(calculoIKCV);
		
		IHIT impostoIHIT = new IHIT();
		//impostoIHIT.setNomeItem("BOLA");
		double calculoIGIT = impostoIHIT.calcula(orcamento);
		System.out.println(calculoIGIT);
	}
}
