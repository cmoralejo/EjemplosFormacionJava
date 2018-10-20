/**
 * 
 */
package es.cmr.colecciones;

/**
 * @author Carlos
 *
 */
public class PruebasListaLinkadaBasica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaLinkadaBasica<String> listaStrings = new ListaLinkadaBasica<>(new String [] {"A","B","C"});
		listaStrings.addElemento("D");
		
		for (String s: listaStrings) {
			System.out.println(s);
		}
		
		ListaLinkadaBasica<Integer> listaIntegers = new ListaLinkadaBasica<>(new Integer [] {1,2,3});
		listaIntegers.addElemento(5);
		
		for (Integer i: listaIntegers) {
			System.out.println(i);
		}
		
		ListaLinkadaBasica<Persona> listaPersonas = new ListaLinkadaBasica<>(new Persona [] {new Persona("Carlos","MR"),new Persona("Javier","MR"),new Persona("PAquita","RA")});
		listaPersonas.addElemento(new Persona("Antonio","MA"));
		
		for (Persona p: listaPersonas) {
			System.out.println(p);
		}
				
	}

}
