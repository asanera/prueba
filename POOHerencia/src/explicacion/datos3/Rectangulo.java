package explicacion.datos3;

public class Rectangulo extends Figura {

	
	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);
	}
	public double area(){
		return getDim1() * getDim2();
	}
	
}
