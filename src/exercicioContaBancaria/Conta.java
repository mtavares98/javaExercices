package exercicioContaBancaria;

public class Conta {

	private String titular;
	private String numero;
	private double saldo;
	
	// Empty Constructor
	public Conta() {
		
	}
	
	// Copy Constructor
	public Conta(Conta c) {
		this.titular = c.titular;
		this.numero = c.numero;
		this.saldo = c.saldo;
	}
	
	//  Parameters Constructor
	public Conta(String titular, String numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	// Method Setters and Getters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Method toString
	@Override
	public String toString() {
		return "Dados da conta\n" + "Nome do titular: " + titular + "\n" + "Numero da Conta: " + numero +"\n" + "Saldo: " + saldo + "\n";
	}
	
	/*Método reforço (valor double): Consiste em aumentar o saldo da conta com o valor
que se indicar. Devemos verificar que o valor não pode ser negativo, se o valor for
negativo, não será feito nada. Este método recebe um parâmetro de entrada com o
valor a receber e devolve true se tiver sido realizada a operação ou false se não tiver
sido realizada.*/
	public boolean Reforco(double valor) {
		
		if (this.saldo < 0 && valor < 0)
			return false;
		this.saldo += valor;
		return true;
	}
	
	/* Método retirada (valor double): Consiste em retirar um valor da conta, ou seja,
	devemos reduzir o saldo da conta. Devemos verificar que o valor não seja negativo
	e, além disso, que tenha saldo suficiente para fazer a retirada, se o valor for
	negativo ou não houver saldo suficiente, não será feito nada. Este método recebe
	um parâmetro de entrada com o valor a subtrair e devolve true se tiver sido
	realizada a operação ou false se não tiver sido realizada. */
	public boolean Levantamento(double valor) {
		
		if (this.saldo < 0 && valor < 0 &&this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}
	
	/* Método transferência (Conta ctaDestino, valor double): Este método deve-nos
	permitir passar dinheiro de uma conta para outra sempre que na conta de origem
	exista saldo suficiente. Este método recebe dois parâmetros, um com uma instância
	de tipo Conta, que será a conta destino do montante, e um segundo parâmetro com
	o valor a transferir, de modo que diminuiremos o saldo da conta e aumentámo-lo na
	outra conta. Deve devolver true se a operação foi realizada ou false se não foi
	realizada. */
	public boolean Transferencia(Conta destino, double valor) {
		if (this.saldo < valor && destino.saldo < 0)
			return false;
		this.saldo -= valor;
		destino.saldo += valor;
		return true;
	}
}
