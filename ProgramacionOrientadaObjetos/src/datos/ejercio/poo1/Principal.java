package datos.ejercio.poo1;

public class Principal {

	public static void main(String[] args) {
		Asignatura a1 = new Asignatura(1);
		Asignatura a2 = new Asignatura(2);
		Asignatura a3 = new Asignatura(3);
		
		Alumno alum = new Alumno(a1, a2, a3);
		
		Profesor p = new Profesor();
		
		p.ponerNota(alum);
		System.out.println("Media: "+ p.calculaMedia(alum));

	}

}
