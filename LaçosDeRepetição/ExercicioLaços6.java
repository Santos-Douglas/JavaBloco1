package La�osDeRepeti��o;

import java.util.Scanner;

/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero) */

public class ExercicioLa�os6 {

	public static void main(String[] args) {
		int num, resto, soma = 0, cont = 0;
		double media;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			resto = num % 3;
					
		if (resto == 0 && num != 0);{
			soma += num;
			cont++;	
		}
			media = soma / cont;
				
		} while (num != 0);
		
		System.out.println("Fim do Programa, voc� '0' ent�o ");
		System.out.println("A M�dia dos n�meros inseridos que s�o m�ltiplos de 3 s�o: "+ media);

	}

}
