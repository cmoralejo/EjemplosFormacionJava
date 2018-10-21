/**
 * @author Carlos Moralejo Romo
 */
package es.cmr.tests.collections;

class FooPerson {
	private String name;
	private String surname;
	
	public FooPerson(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	@Override
	public String toString() {
	return "name:" + name + ", surname:" + surname;
	}

}
