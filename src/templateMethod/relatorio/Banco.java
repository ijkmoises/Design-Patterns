package templateMethod.relatorio;

public class Banco {
	
	private String nome;
	private String endereco;
	private String telefone; 
	private String email;
	
	public Banco(String nome, String endereco, String telefone, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNomeBanco() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	
}
