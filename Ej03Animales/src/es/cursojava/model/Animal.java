package es.cursojava.model;

public class Animal {

		private int numPatas;

		public Animal(int numPatas) {
			this.setNumPatas(numPatas);
		}
		
		public void andar() {
			
			
			System.out.println("Este animal anda sobre "+ getNumPatas() + " patas");
		}

		public void comer() {
			
		}

		public int getNumPatas() {
			return numPatas;
		}

		public void setNumPatas(int numPatas) {
			this.numPatas = numPatas;
		}	
		
		

	}


