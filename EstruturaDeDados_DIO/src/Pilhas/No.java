package Pilhas;

public class No {
	private int dado;
	private No refNo = null;
	
	//construtores
	public No() {
		
	}
	
	public No(int dado) {
		super();
		this.dado = dado;
	}
	
	
	//getters e setters
	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No reNo) {
		this.refNo = reNo;
	}

	@Override
	public String toString() {
		return "\nNo [dado=" + dado + "]";
	}
	
	
	
	
	
}
