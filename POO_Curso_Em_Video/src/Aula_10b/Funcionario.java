package Aula_10b;


public class Funcionario extends Pessoa {
	//Atributos
	private String setor;
	private boolean trabalhando;
	//M�todos
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	//M�todos Especiais
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}
