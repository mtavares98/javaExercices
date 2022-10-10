package praticasJava;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int	num;
			
			do {
				System.out.println("Enter a number: ");
				num = sc.nextInt();
			}
			while (num < 0);
			System.out.println("The number is: " + num);
		}
	}

}
