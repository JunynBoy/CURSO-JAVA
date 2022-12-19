import java.util.Random;
import java.text.DecimalFormat;

public class Conta { //objeto conta
	double saldo;
	int agencia;
	int numero;
    Cliente dados;
	
	public Conta(Cliente d) {
		Random random = new Random();
		int ag = random.nextInt(4000);
		int nm = random.nextInt(900000);
		this.agencia = ag;
		this.numero = nm;
		this.saldo = 0;
		this.dados = d;
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
		System.out.println("Informacoes: " + dados.nome +"\nCPF:"+ 
		this.dados.cpf + "\nProfissao:" + dados.profissao);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + df.format(this.saldo));
		System.out.println("------------------------------------");
		
	}
	
}
