package es.cmr.tests.polymorphism.interfaced;

public class TryIGreetingSpecies {

	public static void main(String[] args) {
		IGreet[] servs = new IGreet[3];
		
		servs[0] = new Cat("mizifu");
		servs[1] = new Dog("doggy");
		servs[2] = new Dog("prop");

		for (IGreet s : servs) {
			System.out.println(s.greet());
		}
	}

}
