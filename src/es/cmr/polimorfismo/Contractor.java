package es.cmr.polimorfismo;

public class Contractor implements Payable  {
	private String name;
	
	public Contractor(String name){
		this.name = name;
	}

	public void promocionar () {
		System.out.println("Promociona contractor: " + this.name);
	}
}
