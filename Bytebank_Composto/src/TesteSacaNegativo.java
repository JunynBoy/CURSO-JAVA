
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Cliente clienteTeste = new Cliente("Zezinho da Vila", "111.111.111-11", "Cozinheiro");
		Conta conta = new Conta(clienteTeste);
		
		conta.deposita(99);
		
		conta.saca(200);
		
		
		conta.status();
		
	}
}
