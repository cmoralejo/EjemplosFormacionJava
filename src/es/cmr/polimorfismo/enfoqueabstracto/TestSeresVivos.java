package es.cmr.polimorfismo.enfoqueabstracto;

public class TestSeresVivos {

	public static void main(String[] args) {
		SerVivo[] servs = new SerVivo[3];
		
		servs[0] = new Gato("mizifu");
		servs[1] = new Perro("doggy");
		servs[2] = new Perro("prop");

		for (SerVivo s : servs) {
			System.out.println(s.saludar() + ". Soy: " + s.getNombre());
		}
	}

}
