import java.util.Random;
import java.text.DecimalFormat;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public Conta(String n) {
		Random random = new Random();
		int ag = random.nextInt(4000);
		int nm = random.nextInt(900000);
		this.agencia = ag;
		this.numero = nm;
		this.titular = n;
		this.saldo = 0;
		
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	public void status() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("----Status na sua conta bancaria----");
		System.out.println("Nome: " + this.titular);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + df.format(this.saldo));
		System.out.println("------------------------------------");
		
	}
	
}
