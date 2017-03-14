package datos;

public class Excepciones {

	public static void main(String[] args) {
		try {
			int d = 0;
			int a = 42/d;
			System.out.println(a);
		} catch (ArithmeticException | NullPointerException e) { //--> Si al producirse dos errores debe de hacer lo mismo se pone esto
			System.out.println("Division / zero");
			System.out.println("Excepcion: "+e);
		} catch (Exception e) {
			System.out.println();
		}//--> Esta es la excepcion generica siempre al final
		System.out.println("Fin");
	}
}
