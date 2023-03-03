package sintaxe_variaveis_e_convenções;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("O valor de acompanhado e =" + acompanhado);
		if(idade >= 18 && acompanhado == true) {	
				System.out.println("Seja bem vindo!");
		}else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
