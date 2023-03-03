package Aula_03b;

public class Caneta {
	public static void main(String[] args) {
		/*
		 * AULA 02
		//instaciação para objeto;
		ClassCaneta caneta1 = new ClassCaneta();
		
		//após instaciado você pode mexer nos atributos com Caneta1.
		caneta1.cor = "Azul";
		caneta1.ponta = 0.5f;
		caneta1.tampada = false;
		
		//tampar ou destampar 
		caneta1.tampar(); //ou caneta1.destampar();
		
		//mostrando status
		caneta1.status();
		
		//mandar rabiscar
		caneta1.rabiscar();
		
		System.out.println("------------------------------------");
		//instanciando nova caneta
		ClassCaneta caneta2 = new ClassCaneta();
		caneta2.modelo = "Hostnet";
		caneta2.cor = "Preta";
		caneta2.status();
		caneta2.destampar();
		caneta2.rabiscar();
		
		AULA 03 LOGO ABAIXO
		*/
		ClassCaneta c1 = new ClassCaneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//mas o método pode:
		c1.destampar();
		c1.carga = 80; //protected, está dentro de uma classe que está utilizando a classe caneta.
		c1.status();
		c1.rabiscar(); 
		
		
		
		
	}

}
