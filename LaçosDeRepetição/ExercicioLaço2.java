package La�osDeRepeti��o;

import java.util.Scanner;

/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */

public class ExercicioLa�o2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num, contPar = 0, contImpar = 0;
		
		for (int i= 1; i <= 10; i ++)
		{
			System.out.println("Difite um n�mero: ");
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
		System.out.println("Foram digitados "+contPar+"n�meros Pares e \n" +contImpar+" n�mero Impares" );
		System.out.println("Fim do Programa" );
	}

}
