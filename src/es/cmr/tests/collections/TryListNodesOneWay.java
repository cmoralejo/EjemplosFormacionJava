/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.collections;

import es.cmr.util.collections.ListNodesOneWay;

public class TryListNodesOneWay {

	public static void main(String[] args) {
		ListNodesOneWay<String> listaStrings = new ListNodesOneWay<>(new String [] {"A","B","C"});
		listaStrings.addNode("D");
		listaStrings.addNode("E");

		
		for (String s: listaStrings) {
			System.out.println(s);
		}
		
	
		
/* Code to throw NoSuchElementException	
		Iterator<String> iListaStrings = listaStrings.iterator();
		System.out.println(iListaStrings.next());
		System.out.println(iListaStrings.next());
		System.out.println(iListaStrings.next());
		System.out.println(iListaStrings.next());
		System.out.println(iListaStrings.next());
		System.out.println(iListaStrings.next());
*/		
		
		
		ListNodesOneWay<Integer> listaIntegers = new ListNodesOneWay<>(new Integer [] {1,2,3});
		listaIntegers.addNode(4);
		
		for (Integer i: listaIntegers) {
			System.out.println(i);
		}
		
		ListNodesOneWay<FooPerson> listPersons = new ListNodesOneWay<>(new FooPerson [] {new FooPerson("C","MR"),new FooPerson("J","MR"),new FooPerson("P","RA")});
		listPersons.addNode(new FooPerson("A","MA"));
		
		for (FooPerson p: listPersons) {
			System.out.println(p);
		}
		
		
	}

}
