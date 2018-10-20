package es.cmr.polimorfismo;



public class TestPayIncease {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Payable workers[] = new Payable[4];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		workers[3] = new ContractorExtranjero("Monguer");
		
		for (Payable p: workers){
			p.promocionar();
		}
	}

}
