package ejercicios2;

import java.util.ArrayList;
import java.util.List;

public class Teatro {
	private String nombre, direccion;
	private List<Funcion> funciones = new ArrayList<Funcion>();
	
	public Teatro() {
	
	}

	public Teatro(String nombre, List<Funcion> funciones) {
		super();
		this.nombre = nombre;
		this.funciones = funciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	@Override
	public String toString() {
		return "Teatro [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
}
