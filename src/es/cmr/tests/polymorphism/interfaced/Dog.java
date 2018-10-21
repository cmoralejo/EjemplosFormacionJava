package es.cmr.tests.polymorphism.interfaced;

public class Dog implements IGreet{
	String name;

	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public String greet() {
		return("Guau guau. I'm: " + name + ", a " + getClass().getSimpleName());
	}
	
}
