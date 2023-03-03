package sintaxe_variaveis_e_convenções;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando o escopo das variaveis");
		
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		if (quantidadePessoas >= 2) {
			//essa variavel existe apenas dentro da chave que ela foi escrita
			 @SuppressWarnings("unused")
			boolean acompanhado = true;
			 
		} else {
			//logo a variavel anterior morre quando fecha as chaves e agnt faz ela nascer de novo aqui
			@SuppressWarnings("unused")
			boolean acompanhado = false;
			
		}

		boolean acompanhado = true ;
		System.out.println("O valor de acompanhado e =" + acompanhado);
		// nesse caso a variavel so funciona graças a ela ter sido inicializada com true
		// se nao tivesse nenhum valor atribuido no codigo anterior
		// o código nao funcionaria.
		
	}
}
