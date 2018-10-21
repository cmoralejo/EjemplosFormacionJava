/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.polymorphism.abstracted;

public class Dog extends Specie{
	public Dog(String name) {
		super(name);
	}

	@Override
	public String greet() {
		return("Guau guau. I'm: " + super.getName() + ", a " + getClass().getSimpleName());
	}
	
}
