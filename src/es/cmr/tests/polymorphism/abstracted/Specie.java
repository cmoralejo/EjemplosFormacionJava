/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.polymorphism.abstracted;

abstract class Specie {
	private String name;
	
	public Specie(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract public String greet();
	
}
