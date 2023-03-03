package Aula_12b;

public class Tartaruga extends Reptil{
	
	@Override
	public void locomover() {
		System.out.println("Andando bem devagar...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo bem devagar...");
	}
	
	@Override 
	public void emitirSom() {
		System.out.println("Sons de tartaruga");
	}
	
	
}
