package es.cmr.polimorfismo;

public abstract class Person {
	private String name;
	
	public Person(String name){
		this.name=name;
	}

	public String getName(){
		return ". Person's name is " + name; 
	}
	
	public abstract void promocionar();
		
}
