package es.cmr.polimorfismo;

public class Employee implements Payable {
	private String name;
	
	public Employee(String name){
		this.name = name;
	}
		
	public void promocionar () {
		System.out.println("Promociona Employee: " + this.name);
	}
}
