package datos;

public class Haedware extends Articulo {

	private boolean periferico;

	public Haedware() {
		// TODO Auto-generated constructor stub
	}

	public Haedware(char codigo, double precio, String descripcion, boolean periferico) {
		super(codigo, precio, descripcion);
		this.periferico = periferico;
	}

	@Override
	public double calcularPrecio() {
		double precioFinal = 0;
		if (getCodigo() == 'A') {
			precioFinal = getPrecio() * 1.10;
		} else if (getCodigo() == 'B')
			precioFinal = getPrecio() * 1.15;

		if (periferico)
			precioFinal = precioFinal * 1.30;
		return precioFinal;
	}

	public boolean isPeriferico() {
		return periferico;
	}

	public void setPeriferico(boolean periferico) {
		this.periferico = periferico;
	}

	@Override
	public String toString() {
		return "Haedware [periferico=" + periferico + ", getCodigo()=" + getCodigo() + ", getPrecio()=" + getPrecio()
				+ ", getDescripcion()=" + getDescripcion() + "]";
	}

}
