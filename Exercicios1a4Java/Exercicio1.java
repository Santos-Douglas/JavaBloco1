package Exercicios1a4Java;

import java.util.Scanner;

/* - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/


public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		n2 = leia.nextInt();
		
		System.out.println("Digite o primeiro n�mero:");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: "+ n1);
		}
		 else if (n2 > n1 && n2 > n3) {
		}
		 else {
			 System.out.println("O maior n�mero �: "+ n3);
		 }
		
		System.out.println("FIM DO PROGRAMA");
	}

}

