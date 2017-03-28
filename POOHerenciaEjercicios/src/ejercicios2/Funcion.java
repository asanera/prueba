package ejercicios2;

public class Funcion {
	private String nombre;
	private double precio;
	
	public Funcion() {
		// TODO Auto-generated constructor stub
	}

	public Funcion(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Funcion [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
