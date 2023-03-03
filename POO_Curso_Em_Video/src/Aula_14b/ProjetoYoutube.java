package Aula_14b;
public class ProjetoYoutube {
	public static void main(String[] args) {		
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 02 de POO");
		v[2] = new Video("Aula 03 de POO");
		  
		
		System.out.println(v[0].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Marcos Gasparini", 21 ,"Masculino","Junin");
		g[1] = new Gafanhoto("creuza", 12, "Feminino", "Creuzita");
		
		System.out.println(g[0].toString());
		
		
		System.out.println("\n\n\n\n\n");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar();
		
		vis[1] = new Visualizacao(g[1], v[1]);
		vis[1].avaliar(87f);
		System.out.println(vis[0].toString());
		System.out.println(vis[1].toString());
		
		
	}
}