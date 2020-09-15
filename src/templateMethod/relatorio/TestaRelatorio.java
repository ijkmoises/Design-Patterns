package templateMethod.relatorio;

/**
 * 
Relatórios são muito parecidos: todos eles contêm cabeçalho, corpo, e rodapé. 

Existem dois tipos de relatórios: simples e complexos.

As diferenças são sutis: relatórios simples possuem cabeçalhos e rodapés de uma linha, 

apenas com o nome do banco e telefone, respectivamente; relatórios complexos possuem cabeçalhos 

que informam o nome do banco, endereço, telefone, e rodapés que informam e-mail, e a data atual.

Além disso, dada uma lista de contas, um relatório simples apenas imprime titular e saldo da conta. 

O relatório complexo exibe titular, agência, número da conta e saldo.

Use Template Method, e implemente o mecanismo de relatórios. Use dados falsos para os dados do banco.
 *
 */


public class TestaRelatorio {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(new Banco("Banco do Brasil","Rua Sete de Abril 2000","11985872054","banco@dobrasil.gov.br"));
		
		RelatorioConta rel = new RelatorioConta();
		String relGerado = rel.gerar(TipoRelatorio.COMPLEXO, conta);
		System.out.println(relGerado);
		
	}
}
