package es.cmr.polimorfismo.enfoqueinterfaz;

public class TestSeresVivos {

	public static void main(String[] args) {
		Saludable[] servs = new Saludable[3];
		
		servs[0] = new Gato("mizifu");
		servs[1] = new Perro("doggy");
		servs[2] = new Perro("prop");

		for (Saludable s : servs) {
			System.out.println(s.saludar());
		}
	}

}
