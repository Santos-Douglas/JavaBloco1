package Intro��oPOOExerciciosClasses;

import java.util.Scanner;

/* CRIE UMA CLASSE AVI�O E APRESENTE OS ATRIBUTOS E M�TODOS REFERENTES ESTA CLASSE. EM SEGUIDA
	 CRIE UM OBJETO AVI�O, DEFINA AS IST�NCIAS DESTE OBJETO E APRESENTE AS INFORMA��ES DESTE OBJETO NO CONSOLE */
	 
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
			System.out.println("Qual � o n�mero do seu assento?: ");
			System.out.println("");
		}
		
		public void exibir() {
			System.out.println("Informa��es referente a sua viagem!");
			System.out.println("");
			System.out.println("Qual a cor do avi�o:" + cor);
			System.out.println("O nome da empresa �: " + empresa);
			System.out.println("O n�mero do seu Assento �: " + numeroAssento);
			System.out.println("");
		}
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			Aviao Aviao2 = new Aviao("Branco", "Lufthansa", 45);
			
			Aviao2.perguntar();
			Aviao2.exibir();
			
	}

}
