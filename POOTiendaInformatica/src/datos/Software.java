package datos;

public class Software extends Articulo {

	private String tipoProducto;

	public Software() {

	}

	public Software(char codigo, double precio, String descripcion, String tipoProducto) {
		super(codigo, precio, descripcion);
		this.tipoProducto = tipoProducto;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	@Override
	public double calcularPrecio() {
		double precioFinal = 0;
		if (getCodigo() == 'B')
			precioFinal = getPrecio() * 1.15;
		else if (getCodigo() == 'C')
			precioFinal = getPrecio() * 1.20;

		if (tipoProducto.equalsIgnoreCase("ProgramaJuegos"))
			precioFinal = precioFinal * 1.05;
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Software [tipoProducto=" + tipoProducto + ", getDescripcion()=" + getDescripcion() + "]";
	}

}
