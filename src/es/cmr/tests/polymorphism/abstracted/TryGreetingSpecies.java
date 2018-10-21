/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.polymorphism.abstracted;

public class TryGreetingSpecies {

	public static void main(String[] args) {
		Specie[] species = new Specie[3];
		
		species[0] = new Cat("mizifu");
		species[1] = new Dog("doggy");
		species[2] = new Dog("prop");

		for (Specie s : species) {
			System.out.println(s.greet());
		}
	}

}
