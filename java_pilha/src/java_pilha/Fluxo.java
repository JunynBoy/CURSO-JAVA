package java_pilha;

public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do mainn");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do método 2");
		metodo2();
		System.out.println("Fim do método 2");
	}
	
	public static void metodo2() {
		System.out.println("Inicio do método 3");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do método 3");
	}
	
	
}
