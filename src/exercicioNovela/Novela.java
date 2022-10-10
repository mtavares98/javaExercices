package exercicioNovela;

public class Novela {

	private String titulo;
	private String autor;
	private int numeroDeExemplares;
	private int numeroDeExemplaresEmprestados;
	
	/* Constructors */
	public Novela() {
		
	}
	
	public Novela(Novela n) {
		
		this.titulo = n.titulo;
		this.autor = n.autor;
		this.numeroDeExemplares = n.numeroDeExemplares;
		this.numeroDeExemplaresEmprestados = n.numeroDeExemplaresEmprestados;
	}
	
	public Novela(String titulo, String autor, int numeroDeExemplares, int numeroDeExemplaresEmprestados) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDeExemplares = numeroDeExemplares;
		this.numeroDeExemplaresEmprestados = numeroDeExemplaresEmprestados;
	}

	/* Setters and Getters*/
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

	public int getNumeroDeExemplares() {
		return numeroDeExemplares;
	}

	public void setNumeroDeExemplares(int numeroDeExemplares) {
		this.numeroDeExemplares = numeroDeExemplares;
	}

	public int getNumeroDeExemplaresEmprestados() {
		return numeroDeExemplaresEmprestados;
	}

	public void setNumeroDeExemplaresEmprestados(int numeroDeExemplaresEmprestados) {
		this.numeroDeExemplaresEmprestados = numeroDeExemplaresEmprestados;
	}

	@Override
	public String toString() {
		return "Dados do livro\n" + "Título: " + titulo + "\nAutor: " + autor + "\nN.º de exemplares: " + numeroDeExemplares
				+ "\nN.º de exemplares emprestados: " + numeroDeExemplaresEmprestados;
	}
	
	/* Método empréstimo(): Deve aumentar o atributo correspondente sempre que for
	feito um empréstimo do livro. Não poderão ser emprestados livros dos quais não
	fiquem exemplares disponíveis para emprestar. Devolve true se tiver sido possível
	realizar a operação e false no caso contrário. */
	public boolean Emprestimo() {
		if (this.numeroDeExemplares >= this.numeroDeExemplaresEmprestados)
			return false;
		this.numeroDeExemplaresEmprestados++;
		return true;
	}
	
	/* Método devolução(): Consiste em diminuir o atributo correspondente quando
ocorrer a devolução de um livro. Não será possível devolver livros que não tenham
sido emprestados. Devolve true se tiver sido possível realizar a operação e false no
caso contrário. */
	public boolean Devolucao() {
		if (this.numeroDeExemplaresEmprestados <= 0)
			return false;
		this.numeroDeExemplaresEmprestados--;
		return true;
	}
}
