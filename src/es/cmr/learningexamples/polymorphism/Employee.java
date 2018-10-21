package es.cmr.learningexamples.polymorphism;

public class Employee implements Payable {
	private String name;
	
	public Employee(String name){
		this.name = name;
	}
		
	public void promote () {
		System.out.println("Promociona Employee: " + this.name);
	}
}
