package clases;

public abstract class Autobus {

	private int idAutobus;
	private Conductor chofer;
	private double precioBase;

	public Autobus(int idAutobus, Conductor chofer, double precioBase) {
		super();
		this.idAutobus = idAutobus;
		this.chofer = chofer;
		this.precioBase = precioBase;
	}

	public Autobus() {
		// TODO Auto-generated constructor stub
	}

	public int getIdAutobus() {
		return idAutobus;
	}

	public void setIdAutobus(int idAutobus) {
		this.idAutobus = idAutobus;
	}

	public Conductor getChofer() {
		return chofer;
	}

	public void setChofer(Conductor chofer) {
		this.chofer = chofer;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public abstract double precioBillete();

	@Override
	public String toString() {
		return "Autobus [idAutobus=" + idAutobus + ", chofer=" + chofer + ", precioBase=" + precioBase + "]";
	}

}
