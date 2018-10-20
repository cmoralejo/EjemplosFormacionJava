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
	Elemento inicio=null;
	Elemento fin=null;	
	Elemento actual=null;
	
	ListaLinkadaBasica(T[] elementos) {
		for (int i=0; i < elementos.length;i++) {
			this.addElemento(elementos[i]);
		}
	}
	
	public void addElemento(T elemento) {
		Elemento nuevo = new Elemento(elemento);
		if (fin==null) {
			inicio=fin=actual=nuevo;
		}
		else {
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	}

	private T getPrimerElemento() {
		actual=inicio;
		return(actual!=null? actual.getDato():null); 
	}
	
	private T getSiguienteElemento() {
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
	
	private class Elemento {
		private T dato;
		private Elemento siguiente;

		Elemento(T dato) {
			this.dato = dato;
			this.siguiente = null;
		}

		Elemento getSiguiente() {
			return siguiente;
		}

		void setSiguiente(Elemento siguiente) {
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
