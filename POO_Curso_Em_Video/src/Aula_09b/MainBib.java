package Aula_09b;

public class MainBib {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Marcos Gasparini", 21, "Masculino");
		Livro l = new Livro("Mochileiro Das Galaxias","Charles D",350);
		
		l.setLeitor(p);
		l.detalhes();
		
	}
}
