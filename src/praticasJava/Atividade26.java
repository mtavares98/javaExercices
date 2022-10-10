package praticasJava;

import javax.swing.JOptionPane;

public class Atividade26 {

	public static void main(String[] args) {
		String pp = "Eureka";
		String password;
		int	i = -1;
		
		while (++i < 3) {
			password = JOptionPane.showInputDialog("Introduz uma palavra-passe");
			if (password.equals(pp)) {
				System.out.println("Congratulations you know the password");
				break;
			}
			else if (!password.equals(pp)) {
				int	j = 2 - i;
				System.out.println("You have " + j + " more tries");
			}
		}
	}

}
