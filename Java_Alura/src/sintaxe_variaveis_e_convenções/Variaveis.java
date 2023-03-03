package sintaxe_variaveis_e_convenções;

public class Variaveis {
	public static void main (String args[]) {
		//int, double, float, char, byte, short, long, boolean
		//este arquivo é somente para entendermos melhor as variáveis e como elas funcionam
		int idade = (int) 10000000000L;
		long numeroGrande = (long) 155.23;
		double salarioDouble = 2000.0D;
		float salarioFloat = (float) 2500.0D;
		byte idadeByte = 127;
		short idadeShort =32000;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = '\u0041'; //conceito da tabela ascii
		String nome = "Vegeta";
		
		
		System.out.println("A sua idade e " + idade);
		System.out.println(falso);
		System.out.println("char " + caractere);
		System.out.println(numeroGrande);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println(idadeByte);
		System.out.println(idadeShort);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println(caractere);
		System.out.println(nome);
		
	}
}
