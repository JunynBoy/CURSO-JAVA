package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente("Paulo Silveira","222.222.222-22","Programador");
		
		//referenciando as duas classes
		Conta contaDoPaulo = new Conta(paulo);
		
		contaDoPaulo.deposita(950.60d);
		contaDoPaulo.status();
	
	}
}
