package praticasJava;

public class Atividade4 {

	public static void main(String[] args) {

		int	i = 0;
		while (++i < 101)
			if (i % 2 == 0 || i % 3 == 0)
				System.out.println(i);
	}

}
