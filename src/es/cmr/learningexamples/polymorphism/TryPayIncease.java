package es.cmr.learningexamples.polymorphism;



public class TryPayIncease {

	public static void main(String[] args) {

		Payable workers[] = new Payable[4];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		workers[3] = new ForeignContractor("Monguer");
		
		for (Payable p: workers){
			p.promote();
		}
	}

}
