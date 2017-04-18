package clases;

public class Urbano extends Autobus {

	private String ruta;
	
	public Urbano(int idAutobus, Conductor chofer, double precioBase, String ruta) {
		super(idAutobus, chofer, precioBase);
		this.ruta = ruta;
	}

	public Urbano() {
		
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public double precioBillete() {
		if(ruta.equalsIgnoreCase("A"))
			return getPrecioBase() * 1.1;
		else
		return getPrecioBase() * 1.2;
	}
	
	@Override
	public String toString() {
		return "Urbano [ruta=" + ruta + ", getIdAutobus()=" + getIdAutobus() + ", getChofer()=" + getChofer()
				+ ", getPrecioBase()=" + getPrecioBase() + "]";
	}

	
	

}
