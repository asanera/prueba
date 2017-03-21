package datos.ejercio.poo1;

public class Principal {

	public static void main(String[] args) {
		
		Alumno alum = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));
		
		Profesor p = new Profesor();
		
		p.ponerNota(alum);
		System.out.println("Media: "+ p.calculaMedia(alum));

	}

}
