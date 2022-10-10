package claseObjeto;

import java.util.Scanner;

public class AppPessoa {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Pessoa pessoa = new Pessoa();
			
			System.out.println("Introduza o nome");
			pessoa.setNome(sc.nextLine());
			System.out.println("Introduza o primeiro apelido");
			pessoa.setPrimeiroApelido(sc.nextLine());
			System.out.println("Introduza o segundo apelido");
			pessoa.setSegundoApelido(sc.nextLine());
			System.out.println("Introduza o cc");
			pessoa.setCc(sc.nextLine());
			System.out.println("Introduza a idade");
			pessoa.setIdade(sc.nextInt());
			System.out.println(pessoa.toString());
		}
	}

}
