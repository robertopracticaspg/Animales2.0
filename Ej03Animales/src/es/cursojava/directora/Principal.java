package es.cursojava.directora;

import es.cursojava.model.Arania;
import es.cursojava.model.Gato;
import es.cursojava.model.Pez;

public class Principal {

	public static void main(String[] args) {
		
		Gato g1 = new Gato("Misifíu");		
		g1.andar();
		g1.comer();
		g1.jugar();
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Pez p1 = new Pez(0, "Nemo");
		p1.andar();
		p1.comer();
		p1.jugar();
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		Arania a1 = new Arania(8,"Luca");
		a1.andar();
		a1.comer();		
	}

}
