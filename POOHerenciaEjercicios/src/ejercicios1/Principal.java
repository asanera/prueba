package ejercicios1;

public class Principal {

	public static void main(String[] args) {
		Garaje gr = new Garaje();
		Coche c1 = new Coche("mercedes", "r332");
		Coche c2 = new Coche("ferrari", "ec23");
		boolean aceptar;
	    aceptar = gr.aceptarCoche(c1, "aceite");

	}

}
