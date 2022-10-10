package heranca;

import claseObjeto.Pessoa;

public class Empregado extends Pessoa{

	private int antiguidade;
	private double salario;
	private String posto;
	
	public Empregado() {
		
	}
	public Empregado(Empregado e) {
		
		this.antiguidade = e.antiguidade;
		this.salario = e.salario;
		this.posto = e.posto;
	}
	
}
