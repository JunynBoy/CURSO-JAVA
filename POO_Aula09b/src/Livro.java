
public class Livro {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//M�todos
	public void detalhes() {
		System.out.println("--------DETALHES--------");
		System.out.println("T�tulo; " + this.getTitulo());
		System.out.println("Autor; " + this.getAutor());
		System.out.println("Total de paginas; " + this.getTotPaginas());
		System.out.println("-----------------------\n");
	}
	
	public void status() {
		System.out.println("----------STATUS-------\n");
		System.out.println("Est� alugado por; " + this.getLeitor().getNome());
		System.out.println("Ele parou na " + this.getPagAtual() + " p�gina.");
		System.out.println("O livro est� aberto? " + this.getAberto());
		System.out.println("-----------------------\n");

	}
	
	public void abrir() {
		this.setAberto(true);
	}
	
	public void fechar() {
		this.setAberto(false);
	}
	
	public void folhear() {
		System.out.println("Come�ando a folhear...");
		for(int i = 1; i <= this.getTotPaginas(); i++) {
			this.setPagAtual(this.getPagAtual() + 1);
			System.out.print("Pag (" + this.getPagAtual() + ")..");
		}
		System.out.println("\nTerminou de folhear!");
		this.setPagAtual(this.getPagAtual() - this.getTotPaginas());
	}
	
	public void avancarPag() {
		if(this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas() ) {
			System.out.println("Avan�ando p�gina..");
			this.setPagAtual(this.getPagAtual() + 1);
			System.out.print("Pag (" + this.getPagAtual() + ")..");	
		} else {
			System.out.println("Voc� chegou ao fim do livro");
		}
		
	}
	
	public void voltarPag() {
		if(this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas() ) {
			System.out.println("Voltando p�gina..");
			this.setPagAtual(this.getPagAtual() - 1);
			System.out.print("Pag (" + this.getPagAtual() + ")..");
		} else {
			System.out.println("Voc� chegou ao come�o do livro!");
		}
		
	}
	
	//M�todos especiais
	public Livro (String tit, String aut, int totP) {
		this.setTitulo(tit);
		this.setAutor(aut);
		this.setTotPaginas(totP);
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
}
