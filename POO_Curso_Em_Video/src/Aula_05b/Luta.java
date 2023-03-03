package Aula_05b;
import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//M�todos P�blicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("Luta Marcada!");
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("A Luta nao foi marcada!");
		}
	}
	public void lutar() {
		if(aprovada) {
			System.out.println("------------------------------------------------------");
			System.out.println("---Desafiado:");
			desafiado.apresentar();
			System.out.println("---Desafiante:");
			desafiante.apresentar();
			Random gerador = new Random();
			int vencedor = gerador.nextInt(3);
			System.out.println("======== Resultado da Luta =========");
			switch(vencedor) {
				case 0:
					System.out.println("Empatou!");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("Desafiado ganhou!");
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 2:
					System.out.println("Desafiante ganhou!");
					desafiante.ganharLuta();
					desafiado.perderLuta();
					break;
			}
		}
	}
	
	//M�todos Especiais
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	
	
}
