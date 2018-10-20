/**
 * 
 */
package es.cmr.genericos;

/**
 * @author Carlos
 *
 */
public class Person implements Comparable<Person> {
	public Person(String name) {
		this.name = name;
	}
	public int compareTo(Person person) {
		if( person == this) {
			return 0;
		}
		if(this.getClass().getName().equals(person.getClass().getName())) {
			return this.name.compareTo(person.name);
			} else if(this.getClass().getName().equals("Manager")) {
			return 1;
			} else {
			return -1;
			}
	}
	@Override
	public String toString() {
		return name;
	}
	protected String name;
}