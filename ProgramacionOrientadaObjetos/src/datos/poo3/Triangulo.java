package datos.poo3;

public class Triangulo {

	private Punto p1;
	private Punto p2;
	private Punto p3;

	public Triangulo() {
		this.p1 = new Punto();
		this.p2 = new Punto(1.2, 10.7);
		this.p3 = new Punto(5.5, 5.5);
	}

	public Triangulo(Punto p1, Punto p2, Punto p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3){
		this.p1 = new Punto(x1,y1);
		this.p2 = new Punto(x2,y2);
		this.p3 = new Punto(x2,y1);
	}
	public Punto getP1() {
		return p1;
	}
	public Punto getP2() {
		return p2;
	}
	public Punto getP3() {
		return p3;
	}
	public double calcularArea(){
		double base = p1.calcularDistanciaDesde(p2);
		double altura = p2.calcularDistanciaDesde(p3);
		return (base*altura)/2;
	}
	public double calcularPerimetro(){
		double lado1 = p1.calcularDistanciaDesde(p2);
		double lado2 = p2.calcularDistanciaDesde(p3);
		double lado3 = p3.calcularDistanciaDesde(p1);
		return lado1 + lado2 + lado3;
	}
	public double calcularDistanciaDesde(Punto p){
		return p1.calcularDistanciaDesde(p);
	}
}



















