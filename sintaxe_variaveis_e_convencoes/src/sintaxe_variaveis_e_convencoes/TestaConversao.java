package sintaxe_variaveis_e_convencoes;

public class TestaConversao {
	public static void main (String[] args) {
		
		double salario = 1270.50;
		@SuppressWarnings("unused")
		float pontoFlutuante = 3.14f; //tem que declarar o f no final se nao ele nao aceita 
		int valor = (int) salario;
		//nós podemos tentar forçar a conversão, e fazer assim um cast
		//nós forçamos o funcionamento dele com o (int) antes do valor atribuido
		System.out.println(valor);
		
		
		//int cabe 32 bits, ele explode muito mais rápido pois ele vai de -31^2 a 31^2
		//já o long ele vai muito mais longe, mas voce tem que avisar ele que o valor está estourando com o L no final
		@SuppressWarnings("unused")
		long numeroGrande = 123124123123L;
		@SuppressWarnings("unused")
		short valorPequeno = 2131; 
		@SuppressWarnings("unused")
		byte b = 127;
		
		//uma coisa muito curiosa dessas linguagens é a seguinte soma;
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}

}
