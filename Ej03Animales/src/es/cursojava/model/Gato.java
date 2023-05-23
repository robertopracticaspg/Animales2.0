package es.cursojava.model;

import es.cursojava.interfaces.Mascotas;

public class Gato extends Animal implements Mascotas {

	private String nombre;
	
	
	public Gato( String nombre) {
		super(4);
		this.nombre = nombre;
	}


	
	public void andar() {
		System.out.println(" Este animal anda sobre " +getNumPatas()+ " patas");
	}


	@Override
	public void jugar() {
		
		System.out.println("A "+ nombre +" le gusta jugar con la pelota");
	}

	@Override
	public void comer() {
		
		System.out.println("A los gatos les gusta comer peces y arañas");
	}



	@Override
	public void getName() {
		
		
	}



	@Override
	public void setName() {
		
		
	}
  
	
	
}
