/**
 * 
 */
package es.cmr.colecciones;


/**
 * @author Carlos
 *
 */
 class ElementoBasico<T> {
	private T dato;
	private ElementoBasico<T> siguiente;

	ElementoBasico(T dato) {
		this.dato = dato;
		this.siguiente = null;
	}

	ElementoBasico<T> getSiguiente() {
		return siguiente;
	}

	void setSiguiente(ElementoBasico<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	T getDato() {
		return dato;
	}

	void setDato(T dato) {
		this.dato = dato;
	}
	
	@Override
	public String toString() {
		return "Elemento: " + dato;
	}
	
}

