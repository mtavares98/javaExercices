package claseObjeto;

public class Pessoa {

	private String nome;
	private String primeiroApelido;
	private String segundoApelido;
	private String cc;
	private int idade;
	
	/* Constructors */
	public Pessoa() {
		
	}
	
	public Pessoa(Pessoa p) {

		this.nome = p.nome;
		this.primeiroApelido = p.primeiroApelido;
		this.segundoApelido = p.segundoApelido;
		this.cc = p.cc;
		this.idade = p.idade;
	}
	
	public Pessoa(String nome, String primeiroApelido, String segundoApelido, String cc, int idade) {

		this.nome = nome;
		this.primeiroApelido = primeiroApelido;
		this.segundoApelido = segundoApelido;
		this.cc = cc;
		this.idade = idade;
	}

	/* Setters and Getters */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrimeiroApelido() {
		return primeiroApelido;
	}

	public void setPrimeiroApelido(String primeiroApelido) {
		this.primeiroApelido = primeiroApelido;
	}

	public String getSegundoApelido() {
		return segundoApelido;
	}

	public void setSegundoApelido(String segundoApelido) {
		this.segundoApelido = segundoApelido;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	/* Method toString */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", primeiroApelido=" + primeiroApelido + ", segundoApelido=" + segundoApelido
				+ ", cc=" + cc + ", idade=" + idade + "]";
	}

	/* Method HashCode and Equals */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		return true;
	}
	
}
