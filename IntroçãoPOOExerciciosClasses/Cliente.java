package IntroçãoPOOExerciciosClasses;

import java.util.Scanner;

/* Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console. */

public class Cliente {
	
	//ATRIBUTOS -> CARACTERISTICAS
		private String nome;
		private int idade;
		private double altura;
	
	//METODO CONSTRUTOR
	
	public Cliente (String nomeInformado, int idadeInformado, double alturaInformado){
				this.nome = nomeInformado;
				this.idade = idadeInformado;
				this.altura = alturaInformado;
	}
	
	public void perguntar() {
		System.out.println(" Qual o valor deste produto?: ");
		System.out.println("");
	}	
	
	public void exibir() {
		System.out.println(" Informações do cliente: ");
		System.out.println("");
		System.out.println("O nome do cliente é: " + nome);
		System.out.println("A idade do cliente é: " + idade);
		System.out.println("A altura do cliente é: " + altura);
		System.out.println("");
	}
	
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		Cliente Cliente1 = new Cliente("Charles", 30, 1.86);
		
	Cliente1.perguntar();
	Cliente1.exibir();

	
	}

}
