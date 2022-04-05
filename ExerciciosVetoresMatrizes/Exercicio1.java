package ExerciciosVetoresMatrizes;

import java.util.Scanner;

/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
	 de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

public class Exercicio1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número informado é: " + n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número informado é: " + n2);
		}
		else {
			System.out.println("O maior número é: " + n3);
		}
			System.out.println("Fim do programa!!");
	}

}
