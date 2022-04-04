package LaçosDeRepetição;

	/* Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. */

public class ExercicioLaço1 {

	public static void main(String[] args) {
		int inicial = 1000, resto;
		
		for (inicial = 1000; inicial < 2000; inicial++) {
			resto = inicial % 11;
			
		if (resto == 5) {
			
		System.out.println(inicial + " ");
		}
		
		}
	}

}
