package es.cursojava.model;

import es.cursojava.interfaces.Mascotas;

public  class Pez extends Animal implements Mascotas {
	String nombre;

	
		
	public Pez(int numPatas, String nombre) {
		super(0);
		this.nombre = nombre;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void comer() {
		System.out.println( "Los peces comen  plancton");
	}
	
	public void jugar() {
		System.out.println("estoy nadando");
	}
	
	public void andar() {
		System.out.println("En realidad no ando, nado");
	}



	@Override
	public void getName() {

		
	}



	@Override
	public void setName() {
		
		
	}
}
