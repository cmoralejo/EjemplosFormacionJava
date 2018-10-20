package es.cmr.polimorfismo;

public class ContractorExtranjero implements Payable  {
	private String name;
	
	public ContractorExtranjero(String name){
		this.name = name;
	}

	public void promocionar () {
		System.out.println("Promociona contractor: " + this.name);
	}
}
