package Listas;

public class No<T> {
	
	private T coteudo;
	private No proximoNo;
	
	//construtores
	public No() {
		this.proximoNo = null;
	}

	public No(T coteudo) {
		this.proximoNo = null;
		this.coteudo = coteudo;
	}

	public No(T coteudo, No proximoNo) {
		this.coteudo = coteudo;
		this.proximoNo = proximoNo;
	}

	
	//getters e setters
	public T getCoteudo() {
		return coteudo;
	}

	public void setCoteudo(T coteudo) {
		this.coteudo = coteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [coteudo=" + coteudo + "]\n";
	}
	
	
	public String toStringEncadeado() {
		String str = "No [coteudo=" + coteudo + "]\n";
		if(proximoNo != null) {
			str += "->" + proximoNo.toString();
		}else {
			str += "->null";
		}
		return str;
	}
	
	
	
}
