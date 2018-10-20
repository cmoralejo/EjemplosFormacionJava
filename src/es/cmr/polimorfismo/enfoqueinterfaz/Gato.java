package es.cmr.polimorfismo.enfoqueinterfaz;

public class Gato implements Saludable{
	String nombre;

	public Gato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String saludar() {
		return("soy " + this.nombre + ",miau miau");
	}
	
}
