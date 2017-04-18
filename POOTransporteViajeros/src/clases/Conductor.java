package clases;

public class Conductor {

	private String nombre;
	private double salario;
	public Conductor(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public Conductor() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
}
