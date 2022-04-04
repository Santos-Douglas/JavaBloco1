package La�osDeRepeti��o;

import java.util.Scanner;

/* Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. */

public class ExercicioLa�o3 {

	public static void main(String[] args) {
		int idade, idade21 = 0, idade50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digita um n�mero para idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			if (idade < 21 && idade >= 0) {
				idade21++;
				
			}
			
			else if (idade > 50) {
				idade50++;
			}
			System.out.println("Digite um novo n�mero para idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("Pessoas com menos de 21 anos de idade: "+ idade21);
		System.out.println("Pessoas com mais de 50 anos de idade: "+ idade50);
		System.out.println("Fim do Programa!!!");

	}

}
