package es.cursojava.model;

public class Arania extends Animal{
	String nombre;



public Arania(int numPatas, String nombre) {
		super(numPatas);
		this.nombre = nombre;
	}
public void comer() {
	
	System.out.println("Las arañas comen mosquitos");
}
public void andar() {
	System.out.println(" Este animal anda sobre " +getNumPatas()+ " patas");
}
}

