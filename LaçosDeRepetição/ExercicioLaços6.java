package LaçosDeRepetição;

import java.util.Scanner;

/* Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero) */

public class ExercicioLaços6 {

	public static void main(String[] args) {
		int num, resto, soma = 0, cont = 0;
		double media;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			resto = num % 3;
					
		if (resto == 0 && num != 0);{
			soma += num;
			cont++;	
		}
			media = soma / cont;
				
		} while (num != 0);
		
		System.out.println("Fim do Programa, você '0' então ");
		System.out.println("A Média dos números inseridos que são múltiplos de 3 são: "+ media);

	}

}
