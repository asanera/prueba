package datos;

public class Principal {

	public static void main(String[] args) {
		Articulo soft1 = new Software('B', 130,"Windows","Sistema operativo");
		Articulo soft2 = new Software('C', 230,"Tetris","ProgramaJuegos");
		
		Articulo hard1 = new Haedware('A',400,"tarjeta video", false);
		Articulo hard2 = new Haedware('B',100,"impresora", true);
		
		mostrarArticulo(soft1, soft2, hard1, hard2);
		
		calcular(soft1, soft2, hard1, hard2);
	}

	private static void calcular(Articulo soft1, Articulo soft2, Articulo hard1, Articulo hard2) {
		System.out.println("Precio de SOFT1 "+ soft1.calcularPrecio());
		System.out.println("Precio de SOFT2 "+ soft2.calcularPrecio());
		System.out.println("Precio de HARD1 "+ hard1.calcularPrecio());
		System.out.println("Precio de HARD2 "+ hard2.calcularPrecio());
	}

	private static void mostrarArticulo(Articulo soft1, Articulo soft2, Articulo hard1, Articulo hard2) {
		System.out.println("SOFT1: "+ soft1);
		System.out.println("SOFT2: "+ soft2);
		System.out.println("HARD: "+ hard1);
		System.out.println("SOFT1: "+ hard2);
	}

}
