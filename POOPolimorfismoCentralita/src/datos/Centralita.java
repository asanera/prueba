package datos;

public class Centralita {

	private int contador;
	private double facturado;
	
	public int getContador() {
		return contador;
	}
	public double getFacturado() {
		return facturado;
	}
	public void registrarLlamada(Llamada l){
		contador++;
		facturado += l.calcularPrecio();
	}
}
