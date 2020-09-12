package chainOfResponsibility.requisicaoParaServidor;

public class RespostaCSV implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.CSV)) {
			
			StringBuilder builder = new StringBuilder();
			builder.append("titular;");
			builder.append("saldo");
			builder.append("/n");
			builder.append(conta.getTitular()).append(";");
			builder.append(conta.getSaldo());

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
