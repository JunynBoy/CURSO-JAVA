
public class Livro {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Métodos
	public void detalhes() {
		System.out.println("--------DETALHES--------");
		System.out.println("Título; " + this.getTitulo());
		System.out.println("Autor; " + this.getAutor());
		System.out.println("Total de paginas; " + this.getTotPaginas());
		System.out.println("-----------------------\n");
	}
	
	public void status() {
		System.out.println("----------STATUS-------\n");
		System.out.println("Está alugado por; " + this.getLeitor().getNome());
		System.out.println("Ele parou na " + this.getPagAtual() + " página.");
		System.out.println("O livro está aberto? " + this.getAberto());
		System.out.println("-----------------------\n");

	}
	
	public void abrir() {
		this.setAberto(true);
	}
	
	public void fechar() {
		this.setAberto(false);
	}
	
	public void folhear() {
		System.out.println("Começando a folhear...");
		for(int i = 1; i <= this.getTotPaginas(); i++) {
			this.setPagAtual(this.getPagAtual() + 1);
			System.out.print("Pag (" + this.getPagAtual() + ")..");
		}
		System.out.println("\nTerminou de folhear!");
		this.setPagAtual(this.getPagAtual() - this.getTotPaginas());
	}
	
	public void avancarPag() {
		if(this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas() ) {
			System.out.println("Avançando página..");
			this.setPagAtual(this.getPagAtual() + 1);
			System.out.print("Pag (" + this.getPagAtual() + ")..");	
		} else {
			System.out.println("Você chegou ao fim do livro");
		}
		
	}
	
	public void voltarPag() {
		if(this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas() ) {
			System.out.println("Voltando página..");
			this.setPagAtual(this.getPagAtual() - 1);
			System.out.print("Pag (" + this.getPagAtual() + ")..");
		} else {
			System.out.println("Você chegou ao começo do livro!");
		}
		
	}
	
	//Métodos especiais
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
