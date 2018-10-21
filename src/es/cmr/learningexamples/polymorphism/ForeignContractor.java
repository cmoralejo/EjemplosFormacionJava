package es.cmr.learningexamples.polymorphism;

public class ForeignContractor implements Payable  {
	private String name;
	
	public ForeignContractor(String name){
		this.name = name;
	}

	public void promote () {
		System.out.println("Promote foreign contractor: " + this.name);
	}
}
