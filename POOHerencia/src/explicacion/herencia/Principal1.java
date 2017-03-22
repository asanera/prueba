package explicacion.herencia;

public class Principal1 {

	public static void main(String[] args) {
		Primera p = new Primera();
		Segunda s = new Segunda();
		
		p.i = 10;
		p.j = 20;
		p.mostrarij();
		
		s.i = 2;
		s.j = 3;
		s.k = 4;
		
		s.mostrarij();
		s.mostrark();
		s.suma();

	}

}
