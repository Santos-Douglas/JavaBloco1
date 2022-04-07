package IntroçãoPOOExerciciosClasses;

import java.util.Scanner;

/* CRIE UMA CLASSE AVIÃO E APRESENTE OS ATRIBUTOS E MÉTODOS REFERENTES ESTA CLASSE. EM SEGUIDA
	 CRIE UM OBJETO AVIÃO, DEFINA AS ISTÂNCIAS DESTE OBJETO E APRESENTE AS INFORMAÇÕES DESTE OBJETO NO CONSOLE */
	 
public class Aviao {
	
		//ATRIBUTOS -> CARACTERISTICAS
		private String cor;
		private String empresa;
		private int numeroAssento;
		
		//METODO CONSTRUTOR
		
		public Aviao (String CorInformar, String empresaInformar, int numeroAssentoInformar) {
				this.cor = CorInformar;
				this.empresa = empresaInformar;
				this.numeroAssento = numeroAssentoInformar;
		}
		
		public void perguntar() {
			System.out.println("Qual é o número do seu assento?: ");
			System.out.println("");
		}
		
		public void exibir() {
			System.out.println("Informações referente a sua viagem!");
			System.out.println("");
			System.out.println("Qual a cor do avião:" + cor);
			System.out.println("O nome da empresa é: " + empresa);
			System.out.println("O número do seu Assento é: " + numeroAssento);
			System.out.println("");
		}
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			Aviao Aviao2 = new Aviao("Branco", "Lufthansa", 45);
			
			Aviao2.perguntar();
			Aviao2.exibir();
			
	}

}
