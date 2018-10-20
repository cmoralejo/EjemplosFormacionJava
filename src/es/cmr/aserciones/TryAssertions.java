/**
 * 
 */
package es.cmr.aserciones;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * @author Carlos
 *
 */
public class TryAssertions {
	public static void main(String args[]) {
		int daysInMonth = 31;
		if(daysInMonth == 30) {
		System.out.println("Month is April, June, September, or November");
		} else if(daysInMonth == 31) {
		System.out.println("Month is January, March, May, July, August, October, or December.");
		} else if(daysInMonth == 28 || daysInMonth == 29) {
		System.out.println("Month is February.");
		} else {
		assert false : "daysInMonth has the value " + daysInMonth;
		}

		String f ="prueba monger";
		String [] tokens = f.split("[ ]");
		for (String token : tokens) {
			System.out.println(token);
		}
	}
	
	
}
