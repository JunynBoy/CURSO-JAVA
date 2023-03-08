package Listas;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	
	//métodos
	public T remove(int index) { 						//objetivo: Remover um nó da lista
		No<T> noPivor = this.getNo(index);				
		if(index == 0 ) {								//se eu estiver com o indice 0 siginifica que eu estou removendo o no 
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getCoteudo();
		}
		
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getCoteudo();
	}
	
	
	
	public T get(int index) {						//Objetivo do método pegar informação do nó que for apontado no índice
		return getNo(index).getCoteudo();			//vai reutilizar o método getnó e vai pegar o conteudo do nó apontado por ele 
	}
	
	

	private No<T> getNo(int index) { 				//objetivo é retornar uma amostra do no ( referencia )
		validaIndice(index);						// vai validar se o índice passado corresponde com o índice existente
		No<T> noAuxiliar = referenciaEntrada; 		//variável auxiliar para indicar o primeiro nó
		No<T> noRetorno = null; 					//armazena o nó que será retornado pelo método
		for(int i = 0 ; i <= index ;i++ ) { 	//loop que percorre o 
			noRetorno = noAuxiliar;					
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
	
	
	public void add(T conteudo) {					 //objetivo, adicionar um novo nó na lista
		No<T> novoNo = new No<>(conteudo);			 //aqui estamos instanciando um novo no com o conteudo desejado
		if(this.isEmpty()) {						 //se nao tiver nenhum nó ainda
			referenciaEntrada = novoNo;				 //você cria um novo nó
			return;									 //e sai do método
		}
		No<T> noAuxiliar = referenciaEntrada;		 //se ela nao estiver vazia voce instancia u nó auxiliar com a referencia para a entrada dos nós
		for (int i = 0 ; i < this.size()-1 ;i++ ) {	 //loop for que percorre a lista encadeada até chegar no último nó 
			noAuxiliar = noAuxiliar.getProximoNo();	 //o nó auxiliar quem vai receber a referencia para percorrer a lista de nós até chegar no último
					                                 //quando o nó auxiliar apontar para o ultimo nó ele vai setar o novo nó como sendo o proximo.
		}
		noAuxiliar.setProximoNo(novoNo);
	}
	
	
	
	public int size() { 							 		      //objetivo é retonar o tamanho do índice 
		int tamanhoLista = 0;						 			  //para isso incializamos a variável
		No<T> referenciaAux = referenciaEntrada;		 		  //variável auxiliar incializada como primeiro nó da lista encadeada
		
		while(true) {								 	   		 //loop infinito para percorrer a lista até achar o final dela
			if(referenciaAux != null) {					  		 //Se a referência atual não for nula, então incrementamos o tamanho da lista em 1.
				tamanhoLista++;							   
				if(referenciaAux.getProximoNo() != null) { 		 //se o próximo nó da lista nao for nulo entao atualizamos a referenciaAux para apontar para o proximo no da lista
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					
					break;										 //se o próximo nó der nulo ele cai no break indicando o final da lista 
				}
			}else {
				
				break;											//se a referencia atual for nula isso significa que chegamos no final da lista e saímos do loop
			}
		
		}
		return tamanhoLista;	
	}
	
	
	
	private void validaIndice(int index) { 						//Objetivo: validar se o indice que foi passado corresponde ao tamanho do índice existente
		if(index >= size()) {									// if que vai percorrer 
			int ultimoIndice = size()-1;
			throw new IndexOutOfBoundsException("Não existe"
					+ " conteúdo no índice" + index + " desta"
							+ " lista. Esta lista vai somente"
							+ " até io índice " + ultimoIndice + ".");
	
		}
	}
	
	
	
	public boolean isEmpty() { 									//objetivo verificar se a lista está vazia 
		return referenciaEntrada == null ? true :  false;
	}
	


	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i< this.size(); i++ ) {
			strRetorno += "ListaEncadeada [referenciaEntrada=" + noAuxiliar + "] ----> ";
			noAuxiliar = noAuxiliar.getProximoNo(); 	
		}
		strRetorno += "null";
		return strRetorno;
	}
	
	
	
	
	
}