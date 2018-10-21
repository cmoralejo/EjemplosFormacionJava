/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.polymorphism.abstracted;

public class Cat extends Specie{
	public Cat(String name) {
		super(name);
	}

	@Override
	public String greet() {
		return("Miau miau. I'm: " + super.getName() + ", a " + getClass().getSimpleName());
	}
	
}
