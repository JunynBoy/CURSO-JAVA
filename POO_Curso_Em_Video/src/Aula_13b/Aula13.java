package Aula_13b;

public class Aula13 {
	public static void main(String[] args) {
		//programa Principal
		Mamifero m = new Mamifero();
		Cachorro c = new Cachorro();
		
		
		
		m.emitirSom();
		c.emitirSom();
		c.reagir("Vai apanhar");
		c.reagir(false);
		c.emitirSom();
	}
}
