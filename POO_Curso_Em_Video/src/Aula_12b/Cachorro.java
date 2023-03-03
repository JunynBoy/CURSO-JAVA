package Aula_12b;

public class Cachorro extends Mamifero{
	
	@Override
	public void alimentar() {
		System.out.println("Comendo comida de cachorro");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo... Au au");
	}

	public void enterrarOsso() {
		System.out.println("Enterrando osso...");
	}
	
}
