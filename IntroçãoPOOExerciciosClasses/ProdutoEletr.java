package Intro��oPOOExerciciosClasses;

import java.util.Scanner;

	/* CRIE UMA CLASSE AVI�O E APRESENTE OS ATRIBUTOS E M�TODOS REFERENTES ESTA CLASSE. EM SEGUIDA
		CRIE UM OBJETO AVI�O, DEFINA AS IST�NCIAS DESTE OBJETO E APRESENTE AS INFORMA��ES DESTE OBJETO NO CONSOLE */

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
			System.out.println("Qual produto voc� procura?: ");
			System.out.println("");
		}
		
		public void exibir() {
			System.out.println("Informa��es referente a sua vinda at� a loja");
			System.out.println("");
			System.out.println("Qual o nome do produto que deseja:" + nome);
			System.out.println("Qual o tamanho que deseja?: " + tamanho);
			System.out.println("At� qual valor pretende gastar?: " + preco);
			System.out.println("");
		}
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			ProdutoEletr Produtoreal = new ProdutoEletr (" Head Set", " grande", 200.00);
			
			Produtoreal.perguntar();
			Produtoreal.exibir();
			
		}
}
