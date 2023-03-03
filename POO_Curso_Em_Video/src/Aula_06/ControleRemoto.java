package Aula_06;

public class ControleRemoto implements Controlador {
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Métodos Especiais
	public ControleRemoto(){
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	private boolean getLigado() {
		return ligado;
	}
	
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Métodos Abstratos
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}
	
	public boolean abrirMenu() {
		if (fecharMenu() == false) {
			if (this.getLigado()) {
				
				System.out.println("--------MENU----------");
				System.out.println("Esta ligado? " + getLigado());
				System.out.println("Esta tocando? " + getTocando());
				System.out.print(this.getVolume());
				for(int i = 0; i <= this.getVolume(); i+=10) {
					System.out.print("|");
				}
				return true;
			} else {
				System.out.println("Nao foi possivel abrir o menu!");
				return false;
			}
		
		} else {
			return false;
		}
				
	}
	
	public boolean fecharMenu() {
		if (this.abrirMenu() == true) {
			System.out.println("Fechando Menu...");	
			return true;
			
		}else {
			System.out.println("O menu já está fechado");
		}
		return false;
		
	}
	
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() +5);
		} else {
			System.out.println("Impossível aumentar volume!"	);
		}
	}
	
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() -5);
		} else {
			System.out.println("Impossível diminuir volume!");
		}
	}
	
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);;
		}
	}
	
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir..");
		}
	}
	
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
	}
	
	
}
