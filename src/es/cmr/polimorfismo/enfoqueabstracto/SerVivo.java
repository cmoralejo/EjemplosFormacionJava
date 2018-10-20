package es.cmr.polimorfismo.enfoqueabstracto;

abstract class SerVivo {
	private String nombre;
	
	public SerVivo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	abstract public String saludar();
	
}
