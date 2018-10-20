/**
 * 
 */
package es.cmr.colecciones;

/**
 * @author Carlos
 *
 */
public class Persona {
	private String nombre;
	private String apellidos;
	
	Persona (String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("Nombre: " + nombre + ",Apellidos: " + apellidos);
	}
}
