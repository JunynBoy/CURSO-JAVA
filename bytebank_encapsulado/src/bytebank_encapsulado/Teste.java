package bytebank_encapsulado;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marcos Gasparini","134.132.423-11","Sultana megid","Programador");
		Conta conta = new Conta(cliente);
		
		Cliente cliente1 = new Cliente("Marcos Gasparini Junior","134.132.423-11","Sultana megid","Programador");
		Conta conta1 = new Conta(cliente1);
		
		Cliente cliente2 = new Cliente("Celia Sao joao","134.132.423-11","Sultana megid","Programador");
		Conta conta2 = new Conta(cliente2);
		
		conta.deposita(17892103378d);
		conta.status();
		
		
		
	}
	
}
