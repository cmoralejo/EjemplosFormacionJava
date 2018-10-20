package es.cmr.polimorfismo.enfoqueabstracto;

public class Perro extends SerVivo{
	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public String saludar() {
		return("guau guau");
	}
	
}
