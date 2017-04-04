package datos;

public abstract class Empleado {
	String nombre, apellido;
	int numSeguridadSocial;
	double sueldo;
	public Empleado(String nombre, String apellido, int numSeguridadSocial, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numSeguridadSocial = numSeguridadSocial;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumSeguridadSocial() {
		return numSeguridadSocial;
	}

	public void setNumSeguridadSocial(int numSeguridadSocial) {
		this.numSeguridadSocial = numSeguridadSocial;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public abstract void pagarSueldo();
}
