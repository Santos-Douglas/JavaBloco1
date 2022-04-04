package LaçosDeRepetição;

import java.util.Scanner;

/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

public class ExercicioLaço2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num, contPar = 0, contImpar = 0;
		
		for (int i= 1; i <= 10; i ++)
		{
			System.out.println("Difite um número: ");
			num = ent.nextInt();
			
			if (num%2==0)
			{
				contPar++;
			}
			if (num % 2 ==1)
			{
				contImpar++;
			}
			
		}
		System.out.println("Foram digitados "+contPar+"números Pares e \n" +contImpar+" número Impares" );
		System.out.println("Fim do Programa" );
	}

}
