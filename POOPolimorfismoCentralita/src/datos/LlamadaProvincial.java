package datos;

public class LlamadaProvincial extends Llamada {

	private double precio1 = 20;
	private double precio2 = 25;
	private double precio3 = 30;
	private int franja;
	
	public LlamadaProvincial(String nunOrigen, String numDestino, double duracion, int franaja) {
		super(nunOrigen, numDestino, duracion);
		this.franja = franaja;
	}

	@Override
	public double calcularPrecio() {
		switch (franja) {
		case 0:
			return getDuracion()*precio1;
		case 1:
			return getDuracion()*precio2;
		case 2:
			return getDuracion()*precio3;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "LlamadaProvincial [getNunOrigen()=" + getNunOrigen() + ", getNumDestino()=" + getNumDestino()
				+ ", getDuracion()=" + getDuracion() + "]";
	}

}
