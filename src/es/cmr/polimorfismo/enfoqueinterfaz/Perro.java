package es.cmr.polimorfismo.enfoqueinterfaz;

public class Perro implements Saludable{
	String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String saludar() {
		return("soy " + this.nombre + ",guau guau");
	}
	
}
