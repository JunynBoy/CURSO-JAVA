package Aula_05b;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		//ordem do costrutor;  nome nacionalidade idade vitorias
		//derrotas empates altura peso
		
		
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 31 , 11, 
				2 ,1 ,1.75f ,68.9f);
		
		l[1] = new Lutador("Putscript", "Brasil", 29 , 14, 
				2 ,3 ,1.68f ,57.8f);
		
		l[2]=new Lutador("SnapShadow","EUA",35 , 14, 
				2 ,3 ,1.65f ,80.9f);
		
		l[3]=new Lutador("Dead Code","Australia",28 , 14, 
				2 ,3 ,1.93f ,81.6f);
		
		l[4]=new Lutador("UFOCobol","Brasil",37 , 14, 
				2 ,3 ,1.70f ,119.3f);
		
		l[5]=new Lutador("Nerdaart","EUA",30 , 14, 
				2 ,3 ,1.81f ,105.7f);
		
		
		Luta l1 = new Luta();
		l1.marcarLuta(l[3], l[2]);
		l1.lutar();
		System.out.println("Comparando se os dados foram alterados: \n");
		l[3].status();
		l[2].status();
	}
}
