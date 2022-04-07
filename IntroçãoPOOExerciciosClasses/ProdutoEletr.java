package IntroçãoPOOExerciciosClasses;

import java.util.Scanner;

	/* CRIE UMA CLASSE AVIÃO E APRESENTE OS ATRIBUTOS E MÉTODOS REFERENTES ESTA CLASSE. EM SEGUIDA
		CRIE UM OBJETO AVIÃO, DEFINA AS ISTÂNCIAS DESTE OBJETO E APRESENTE AS INFORMAÇÕES DESTE OBJETO NO CONSOLE */

public class ProdutoEletr {
	
		//ATRIBUTOS -> CARACTERISTICAS
		private String nome;
		private String tamanho;
		private double preco;
			
		//METODO CONSTRUTOR
		
		public ProdutoEletr (String nomeProduto, String tamanhoProduto, double precoProduto) {
			this.nome = nomeProduto;
			this.tamanho = tamanhoProduto;
			this.preco = precoProduto;
			
		}
		
		public void perguntar() {
			System.out.println("Qual produto você procura?: ");
			System.out.println("");
		}
		
		public void exibir() {
			System.out.println("Informações referente a sua vinda até a loja");
			System.out.println("");
			System.out.println("Qual o nome do produto que deseja:" + nome);
			System.out.println("Qual o tamanho que deseja?: " + tamanho);
			System.out.println("Até qual valor pretende gastar?: " + preco);
			System.out.println("");
		}
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			ProdutoEletr Produtoreal = new ProdutoEletr (" Head Set", " grande", 200.00);
			
			Produtoreal.perguntar();
			Produtoreal.exibir();
			
		}
}
