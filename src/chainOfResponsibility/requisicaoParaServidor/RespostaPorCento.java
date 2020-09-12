package chainOfResponsibility.requisicaoParaServidor;

public class RespostaPorCento implements Resposta {

	private Resposta outraResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			StringBuilder builder = new StringBuilder();
			builder.append(conta.getTitular());
			builder.append("&");
			builder.append(conta.getSaldo());
			System.out.println(builder.toString());

		} else if (outraResposta != null) {
			outraResposta.responde(req, conta);
		} else {
			// não existe próxima na corrente, e ninguém atendeu a requisição!
			// poderíamos não ter feito nada aqui, caso não fosse necessário!
			throw new RuntimeException("Formato de resposta não encontrado");
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}
}
