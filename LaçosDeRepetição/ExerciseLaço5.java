package La�osDeRepeti��o;

import java.util.Scanner;

/* Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados. */

public class ExerciseLa�o5 {

	public static void main(String[] args) {
		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			soma += num;
		
		} while (num != 0);
		System.out.println("Final do Programa, Voc� Digitou '0'!");
		System.out.println("A Soma dos n�meros digitados foi: "+ soma);
		

	}

}
