package praticasJava;

import javax.swing.JOptionPane;

public class Atividade7 {

	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Introduz um dia da semana");
		
		switch (dia) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				System.out.println("It's a day of work");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println("It's weeknd");
				break;
			default:
				System.out.println("Invalid option");
		}
	}

}
