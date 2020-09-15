package templateMethod.relatorio;

import java.util.Calendar;

public class RelatorioConta extends TemplateDeRelatorios{

	/*
		relatórios simples possuem cabeçalhos e rodapés de uma linha, apenas com o nome do banco e telefone, respectivamente
	 * */
	
	@Override
	protected String relatorioSimples(Conta conta) {
		StringBuilder s = new StringBuilder();
		s.append("Banco: ").append(conta.getBanco().getNomeBanco())
		.append(" Telefone: ").append(conta.getBanco().getTelefone());
		return s.toString();
	}
	
	
	/*
		relatórios complexos possuem cabeçalhos que informam o nome do banco, endereço, telefone, 
		e rodapés que informam e-mail, e a data atual.
	 * */
	@Override
	protected String relatorioComlplexo(Conta conta) {
		StringBuilder s = new StringBuilder();
		s.append("Banco: ").append(conta.getBanco().getNomeBanco())
		.append(" Endereco: ").append(conta.getBanco().getEndereco())
		.append(" Telefone: ").append(conta.getBanco().getTelefone())
		.append("\n")
		.append("E-mail: ").append(conta.getBanco().getEmail())
		.append(" Data atual: ").append(Calendar.getInstance().getTime().toString());
		return s.toString();
	}

}
