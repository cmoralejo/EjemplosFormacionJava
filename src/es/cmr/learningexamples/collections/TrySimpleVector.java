package es.cmr.learningexamples.collections;


/**
 * Fecha/hora creación: 22-10-2018 17:08:05
 * Autor:  ()
 *
 * /// TODO : ADD TYPE DESCRIPTION
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
public class TrySimpleVector {
	public static void main(String[] args) {
//		Vector<String> names = new Vector<>();
		String[] firstnames = { "Jack", "Jill", "John",
				"Joan", "Jeremiah", "Josephine"};
		// Add the names to the vector
//		for(String firstname : firstnames) {
//			names.add(firstname);
//		}
		
		Vector<String> names = new Vector<>(Arrays.asList(firstnames));
//		names.addAll(Arrays.asList(firstnames));
		
		// List the contents of the vector
		for(String name : names) {
			System.out.println(name);
		}
	}
}