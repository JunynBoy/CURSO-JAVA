package sintaxe_variaveis_e_convencoes;

public class CalculoFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int n1 = 1; n1<=10 ; n1++) {
				fatorial = fatorial * n1;
				System.out.println("Fatorial de "+ n1 + " e = " + fatorial );
			}
		}
		
	}

