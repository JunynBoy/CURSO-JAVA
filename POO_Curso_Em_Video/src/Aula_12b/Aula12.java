package Aula_12b;

public class Aula12 {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		
	
		
		//o nome � sempre o mesmo e a resposta chega diferente
		//o nome disso � polimorfismo
		a.locomover();
		p.locomover();
		r.locomover();
		
		
	}
}
