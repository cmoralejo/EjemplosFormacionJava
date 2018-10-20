package es.cmr.polimorfismo.enfoqueabstracto;

public class Gato extends SerVivo{
	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String saludar() {
		return("miau miau");
	}
	
}
