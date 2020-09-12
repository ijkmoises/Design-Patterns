package chainOfResponsibility.requisicaoParaServidor;


/**
 * O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.
Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.
 * 
 * 
 * */

public class TestaRequisicao {
	
	public static void main(String[] args) {
			
		Conta conta = new Conta("Moises",200.0);
		
		RespostaCSV req1 = new RespostaCSV();
		RespostaXML req2 = new RespostaXML();
		RespostaPorCento req3 = new RespostaPorCento();
			
		req1.setProxima(req2);
		req2.setProxima(req3);

		req1.responde(new Requisicao(Formato.PORCENTO), conta);
	
	}
}
