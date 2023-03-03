package bytebank_encapsulado;

import java.text.DecimalFormat;
import java.util.Random;


public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(Cliente n) {
		total++;
		Random random = new Random();
		int ag = random.nextInt(4000);
		int nm = random.nextInt(900000);
		this.agencia = ag;
		this.numero = nm;
		this.saldo = 1.0d;
		this.titular = n;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void status() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("----Status na sua conta bancaria----");
		System.out.println("Dados: " + getTitular().statusCliente());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + df.format(this.saldo));
		System.out.println("------------------------------------");
		System.out.println("Total de contas abertas: " + getTotal());
		System.out.println("------------------------------------");
		
	}
	
	public double getSaldo() {
		return this.numero;
	}
	
	public int getNumero() { //getter
		return this.numero; 
	}
	
	public void setNumero(int novoNumero){ //setter
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente n) {
		this.titular = n;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public int getTotal() {
		return total;
	}
	
}
