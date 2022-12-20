import java.util.Random;
import java.text.DecimalFormat;

public class Conta { //objeto conta
	private double saldo;
	int agencia;
	int numero;
    Cliente titular;
	
	public Conta(Cliente n) {
		Random random = new Random();
		int ag = random.nextInt(4000);
		int nm = random.nextInt(900000);
		this.agencia = ag;
		this.numero = nm;
		this.saldo = 1.0d;
		this.titular = n;
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
		System.out.println("Informacoes: " + titular.nome +"\nCPF:"+ 
		this.titular.cpf + "\nProfissao:" + titular.profissao);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + df.format(this.saldo));
		System.out.println("------------------------------------");
		
	}
	
}
