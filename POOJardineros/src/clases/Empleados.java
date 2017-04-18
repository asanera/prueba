package clases;

public abstract class Empleados {

	private String dni;
	private double  sueldoBase;
	static double productividad;
	public Empleados() {
		// TODO Auto-generated constructor stub
	}
	public Empleados(String dni, double sueldoBase) {
		super();
		this.dni = dni;
		this.sueldoBase = sueldoBase;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public abstract double calculaSueldoMensual();	
	protected abstract double calculaExtras();
	public abstract void comienzaMes();
	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", sueldoBase=" + sueldoBase + "]";
	}
	
}
