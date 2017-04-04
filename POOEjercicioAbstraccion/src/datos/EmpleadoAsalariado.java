package datos;

public class EmpleadoAsalariado extends Empleado {

	public int semanas;
	public EmpleadoAsalariado(String nombre, String apellido, int numSeguridadSocial, double sueldo, int semanas) {
		super(nombre, apellido, numSeguridadSocial, sueldo);
		this.semanas = semanas;
	}

	@Override
	public void pagarSueldo() {
		sueldo += sueldo;

	}

}
