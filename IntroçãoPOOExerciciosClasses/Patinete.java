package IntroçãoPOOExerciciosClasses;

import java.util.Scanner;

/* CRIE UMA CLASSE AVIÃO E APRESENTE OS ATRIBUTOS E MÉTODOS REFERENTES ESTA CLASSE. EM SEGUIDA
	CRIE UM OBJETO AVIÃO, DEFINA AS ISTÂNCIAS DESTE OBJETO E APRESENTE AS INFORMAÇÕES DESTE OBJETO NO CONSOLE */

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
			System.out.println("Qual modelo de Patinete você procura?: ");
			System.out.println("");
		
		}
		
		public void exibir() {
			System.out.println("Informações referente a sua compra! ");
			System.out.println("");
			System.out.println("Qual marca você está procurando?: " + marca);
			System.out.println("Qual material seria ideal para você?: " + material);
			System.out.println("Até qual valor pretende gastar?: " + valor);
			System.out.println("");
			
		}
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			Patinete PatinetePro = new Patinete (" FostonPro", " FibraCarbono", 5000);
			
			PatinetePro.perguntar();
			PatinetePro.exibir();
			
		}
}
