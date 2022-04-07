package Intro��oPOOExerciciosClasses;

import java.util.Scanner;

/* CRIE UMA CLASSE AVI�O E APRESENTE OS ATRIBUTOS E M�TODOS REFERENTES ESTA CLASSE. EM SEGUIDA
	CRIE UM OBJETO AVI�O, DEFINA AS IST�NCIAS DESTE OBJETO E APRESENTE AS INFORMA��ES DESTE OBJETO NO CONSOLE */

public class Patinete {
	
		//ATRIBUTOS -> CARACTERISTICAS
			private String marca;
			private String material;
			private double valor;
			
		//METODO CONSTRUTOR
			
		public Patinete (String marcaPatinete, String materialPatinete, double valorPatinete) {
				this.marca = marcaPatinete;
				this.material = materialPatinete;
				this.valor = valorPatinete;
		}
		
		public void perguntar() {
			System.out.println("Qual modelo de Patinete voc� procura?: ");
			System.out.println("");
		
		}
		
		public void exibir() {
			System.out.println("Informa��es referente a sua compra! ");
			System.out.println("");
			System.out.println("Qual marca voc� est� procurando?: " + marca);
			System.out.println("Qual material seria ideal para voc�?: " + material);
			System.out.println("At� qual valor pretende gastar?: " + valor);
			System.out.println("");
			
		}
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			Patinete PatinetePro = new Patinete (" FostonPro", " FibraCarbono", 5000);
			
			PatinetePro.perguntar();
			PatinetePro.exibir();
			
		}
}
