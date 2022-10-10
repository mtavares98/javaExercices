package exercicioContaBancaria;

public class OperacoesBancarias {

	public static void main(String[] args) {
	
		Conta a = new Conta();
		
		a.setTitular( "Frederico Garcia");
		a.setNumero("01012020030340400505");
		a.setSaldo(2890.00);
		if (a.Reforco(100.00) == true)
			System.out.println(a.toString());
		else
			System.out.println("Não foi possível realizar a operação");
		
		Conta b = new Conta(a);
		if (b.Levantamento(290.00) == true)
			System.out.println(b.toString());
		else
			System.out.println("Não foi possível realizar a operação");
		
		Conta c = new Conta("Afonso Rua", "11112222333344445555", 0.00);
		if (a.Transferencia(c, 1000) == false)
			System.out.println("Não foi possível realizar a operação");
		else {
			System.out.println(b.toString());
			System.out.println(c.toString());
		}
	}

}
