package ExerciciosVetoresMatrizes;

import java.util.Scanner;

/* Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o 
	 de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */

public class Exercicio1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite o 1� n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero informado �: " + n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero informado �: " + n2);
		}
		else {
			System.out.println("O maior n�mero �: " + n3);
		}
			System.out.println("Fim do programa!!");
	}

}
