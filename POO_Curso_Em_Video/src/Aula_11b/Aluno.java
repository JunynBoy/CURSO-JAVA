package Aula_11b;

public class Aluno extends Pessoa {
	//Atributos herdados (..)
	//Atributos
	private int matricula;
	private String curso;
	
	//M�todos
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}

	
	//M�todos especiais
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
