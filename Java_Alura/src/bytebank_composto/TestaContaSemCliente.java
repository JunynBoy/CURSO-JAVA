package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Cliente clienteMarcela = new Cliente ("Marcela Magrela","487.123.123.11","Servente");
		System.out.println(clienteMarcela.nome);
		
		Conta contaDaMarcela = new Conta(clienteMarcela);
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
