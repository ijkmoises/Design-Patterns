package chainOfResponsibility.requisicaoParaServidor;

public class RespostaXML implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.XML)) {
			
			StringBuilder builder = new StringBuilder();
			builder.append("<conta>");
				builder.append("<titular>");
					builder.append(conta.getTitular());
				builder.append("</titular>");
				builder.append("<saldo>");
					builder.append(conta.getSaldo());
				builder.append("</saldo>");
			builder.append("</conta>");
			
			System.out.println(builder.toString());
		}else {
			proxima.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}
}
