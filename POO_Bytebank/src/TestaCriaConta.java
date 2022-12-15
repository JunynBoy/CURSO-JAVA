
public class TestaCriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta("zoio");
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta("frangolino");
		segundaConta.saldo = 50.0f;
		
		System.out.println("Primeira conta tem : R$" + segundaConta.saldo);
		System.out.println("Segunda conta tem : R$" + primeiraConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta esta" + " na agencia " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		}else {
			System.out.println("Sao contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		//aqui percebemos que o endereçamento para o objeto e diferente para ambas as variaveis
		
	}

}
