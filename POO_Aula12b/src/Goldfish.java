
public class Goldfish extends Peixe{
	
	@Override
	public void locomover() {
		System.out.println("nadando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo comida de peixe");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Soltando bolhas");
	}
	
}
