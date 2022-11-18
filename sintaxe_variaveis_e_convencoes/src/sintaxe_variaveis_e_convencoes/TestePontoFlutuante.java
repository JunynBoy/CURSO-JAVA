 package sintaxe_variaveis_e_convencoes;

/**
 * @author acer
 *
 */
public class TestePontoFlutuante {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("meu salario e" + salario);
		
		double idade = 37; //numero com vírgula com 10 casas decimais de precisao
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao =  5 / 2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0 / 2; //é necessario atribuir pelo menos 1 dos valores como real, se nao ele nao vai armazenar o valor 2.5 apenas o valor 2 pois se trata de inteiros
		System.out.println(novaTentativa);
		
	}

}
