package es.cmr.learningexamples.polymorphism;

public class Contractor implements Payable  {
	private String name;
	
	public Contractor(String name){
		this.name = name;
	}

	public void promote () {
		System.out.println("Promote contractor: " + this.name);
	}
}
