package Nos;

public class principal {
	public static void main(String[] args) {
	
		No<String> no1 = new No<>("Conteudo1");
		No<String> no2 = new No<>("Conteudo2");
		No<String> no3 = new No<>("Conteudo3");
		No<String> no4 = new No<>("Conteudo4");

		no1.setProximoNo(no2);
		no2.setProximoNo(no3);
		no3.setProximoNo(no4);
		//no1->no2->no3->no4->null
		
	
		System.out.println("---------------------------------");
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
		
	}
}
