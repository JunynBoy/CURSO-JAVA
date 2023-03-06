package Pilhas;

public class Pilha {
	private No refNoEntradaPilha;

	public Pilha() {
		
		this.refNoEntradaPilha = null;
	}
	
	//serve para colocar um método na pilha
	public void push(No novoNo){
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	//tira o 1° método da pilha
	public No pop(){
		if(!this.isEmpty()){
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	//retorna o 1° método da pilha
	public No top(){
		return refNoEntradaPilha;
	}
	
	//retorna se a pilha está nula 
	public boolean isEmpty() {
//		if(refNoEntradaPilha == null) {
//			return true;	
//		}else {
//			return false;
//		}
		return refNoEntradaPilha == null ? true : false;
		
	}
	
	@Override
	public String toString() {
		String stringRetorno = "--------------------\n";
		stringRetorno += "     Pilha\n";
		stringRetorno += "-------------------\n";
		
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		stringRetorno += "=================\n";
		return stringRetorno;
	}
	
}
