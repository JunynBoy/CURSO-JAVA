
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta(paulo);
		contaDoPaulo.deposita(950.60d);
		contaDoPaulo.status();
	
	}
}
