
public class TesteReferencias {
	public static void main() {
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
	}
}
