package es.cmr.tests.polymorphism.interfaced;

public class Cat implements IGreet{
	String name;

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	public String greet() {
		return("Miau miau. I'm: " + name + ", a " + getClass().getSimpleName());
	}
	
}
