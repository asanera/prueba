package datos;

public class LlamadaLocal extends Llamada {
	
	private double precio = 15;
	
	public LlamadaLocal(String nunOrigen, String numDestino, double duracion) {
		super(nunOrigen, numDestino, duracion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		return precio *  getDuracion();
	}

	@Override
	public String toString() {
		return "LlamadaLocal [precio=" + precio + ", getNunOrigen()=" + getNunOrigen() + ", getNumDestino()="
				+ getNumDestino() + ", getDuracion()=" + getDuracion() + "]";
	}

}
