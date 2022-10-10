package praticasJava;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter a number: ");
				int i = sc.nextInt();
				if (i % 2 == 0)
						System.out.println("The number " + i + " is divisible by 2");
				else
					System.out.println("The number " + i + " is not divisible by 2");
			}
	}
}	
