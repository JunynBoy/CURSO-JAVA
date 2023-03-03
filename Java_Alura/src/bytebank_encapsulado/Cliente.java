package bytebank_encapsulado;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private String profissao;
	
	public Cliente(String n, String c, String e, String p) {
		nome = n;
		cpf = c;
		endereco = e;
		profissao = p;
	}

	public String statusCliente( ) {
		String s = ( this.nome+ ", " + this.cpf + ", \n" + this.endereco+ ", " + this.profissao );
		return s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
}
