package templateMethod.relatorio;


public abstract class TemplateDeRelatorios implements Relatorio {
	
	@Override
	public String gerar(TipoRelatorio tipo,Conta conta) {
		if(tipo == TipoRelatorio.SIMPLES) {
			return relatorioSimples(conta);
		}else if(tipo == TipoRelatorio.COMPLEXO) {
			return relatorioComlplexo(conta);
		}
		return null;
	}
	
	protected abstract String relatorioSimples(Conta conta);
	protected abstract String relatorioComlplexo(Conta conta);
}
