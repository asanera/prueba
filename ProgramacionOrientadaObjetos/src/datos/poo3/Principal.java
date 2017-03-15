package datos.poo3;

public class Principal {

	public static void main(String[] args) {
		Punto a = new Punto();
		Punto b = new Punto (1.1,4.3);
		System.out.println("La distancia entre a y b es: "+a.calcularDistanciaDesde(b));
		
		Circulo c = new Circulo(a,5.3);
		System.out.println("Area: "+c.calculaArea());
		System.out.println("Perimetro: "+c.calcularPerimetro());
		System.out.println("La distancia de b al centro es: "+b.calcularDistanciaDesde(c.getCentro()));
		System.out.println("La distancia de b al centro es: "+c.calcularDistanciaDesde(b));
		
		Triangulo t = new Triangulo(a,b, new Punto(7.3,1.9));
		System.out.println("Area: "+ t.calcularArea());
		System.out.println("Perimetro: "+t.calcularPerimetro());
		System.out.println("La distancia de b al centro es: "+ t.calcularDistanciaDesde(new Punto(10.3,3.3)));


	}

}
