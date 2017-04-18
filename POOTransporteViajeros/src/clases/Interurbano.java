package clases;

public class Interurbano extends Autobus {

	private double numKilometros;

	public Interurbano(int idAutobus, Conductor chofer, double precioBase, double numKilometros) {
		super(idAutobus, chofer, precioBase);
		this.numKilometros = numKilometros;
	}

	public Interurbano() {
		// TODO Auto-generated constructor stub
	}

	public double getNumKilometros() {
		return numKilometros;
	}

	public void setNumKilometros(double numKilometros) {
		this.numKilometros = numKilometros;
	}
	@Override
	public double precioBillete() {
		return getPrecioBase()*numKilometros;		
	}
	@Override
	public String toString() {
		return "Interurbano [numKilometros=" + numKilometros + ", getIdAutobus()=" + getIdAutobus() + ", getChofer()="
				+ getChofer() + ", getPrecioBase()=" + getPrecioBase() + "]";
	}

	

}
