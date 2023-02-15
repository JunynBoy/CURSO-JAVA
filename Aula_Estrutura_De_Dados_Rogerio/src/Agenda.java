import java.util.Scanner;
//Registro
public class Agenda {
	
	private String nome;
	private int codigoDeArea;
	private int telefone;
	private String cidade;
	
	public Agenda(String nome, int codigoDeArea, int telefone, String cidade) {
		this.nome = nome;
		this.codigoDeArea = codigoDeArea;
		this.telefone = telefone;
		this.cidade = cidade;
	}
	
	public void Relatorio() {
		System.out.println("Nome: " + nome); 
		System.out.println("Telefone: " + codigoDeArea + telefone);
		System.out.println("Cidade: " + cidade);
	}
	
	
	
	//programa principal
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
    	Agenda p[] = new Agenda[80];
    	
    	for (int i = 0; i < 80 ; i++) {
        	if(i<25) {
        		p[i] = new Agenda("Pessoa aleatoria", 14, 123123, "Bofete");
        	} else if(i<50){
        		p[i] = new Agenda("Pessoa aleatoria3", 13, 123123, "Jose dos campo");
        	} else if(i<75){
        		p[i] = new Agenda("Pessoa aleatoria", 15, 123123, "Sao Pelo");
        	} else {
        		p[i] = new Agenda("Pessoa aleatoria2", 11, 123123, "Botucatu");
        	}
        }
        
        int area;
        System.out.println("Selecione um código de área para filtragem:");
        area = ler.nextInt();
        
        for (int i = 0; i < 80 ; i++) {
	        if (p[i].codigoDeArea == area) {
	     	   System.out.println("----------------------");
	     	   p[i].Relatorio();
	     	   System.out.println("----------------------");
	        } else {
	     	   System.out.println("A pessoa " + i + " não é da Área que você procura");
	        }
        }
	}
}
