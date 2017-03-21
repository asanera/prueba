package datos.ejercio.poo1;

public class Alumno {

	private Asignatura a1,a2,a3;

	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	public Alumno(int identificador1,int identificador2,int identificador3 ){
		this.a1 = new Asignatura(identificador1);
		this.a2 = new Asignatura(identificador2);
		this.a3 = new Asignatura(identificador3);
	}
	public Asignatura getA1() {
		return a1;
	}
	public Asignatura getA2() {
		return a2;
	}
	public Asignatura getA3() {
		return a3;
	}
}
