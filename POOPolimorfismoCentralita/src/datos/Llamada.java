package datos;

public abstract class Llamada {

	private String nunOrigen, numDestino;
	private double duracion;
	
	public Llamada() {
		
	}
	public String getNunOrigen() {
		return nunOrigen;
	}
	public String getNumDestino() {
		return numDestino;
	}
	public double getDuracion() {
		return duracion;
	}
	public Llamada(String nunOrigen, String numDestino, double duracion) {
		super();
		this.nunOrigen = nunOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}
	public abstract double calcularPrecio();
}
