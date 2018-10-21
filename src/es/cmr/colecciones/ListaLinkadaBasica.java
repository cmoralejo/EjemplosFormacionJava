/**
 * 
 */
package es.cmr.colecciones;

import java.util.Iterator;

/**
 * @author Carlos
 *
 */
public class ListaLinkadaBasica<T> implements Iterable<T>{
	ElementoBasico<T> inicio=null;
	ElementoBasico<T> fin=null;	
	ElementoBasico<T> actual=null;
	
	ListaLinkadaBasica(T[] elementos) {
		for (int i=0; i < elementos.length;i++) {
			this.addElemento(elementos[i]);
		}
	}
	
	public void addElemento(T elemento) {
		ElementoBasico<T> nuevo = new ElementoBasico<>(elemento);
		if (fin==null) {
			inicio=fin=actual=nuevo;
		}
		else {
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	}

	protected T getPrimerElemento() {
		actual=inicio;
		return(actual!=null? actual.getDato():null); 
	}
	
	protected T getSiguienteElemento() {
		if (haySiguienteElemento()) {
			actual=actual.getSiguiente();
			return(actual.getDato());
		}
		else {
			return(null);
		}
	}
	
	
	private boolean haySiguienteElemento() {
		return (actual.getSiguiente()!=null);
	}
	

	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>() {
			private T siguienteElemento=getPrimerElemento();
			
			
			@Override
			public boolean hasNext() {
				return(siguienteElemento!=null);
			}

			@Override
			public T next() {
				T elemento = siguienteElemento;
				siguienteElemento = getSiguienteElemento();
				return(elemento);
			}
			
		};
	}
}
