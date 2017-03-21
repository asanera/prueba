package datos.ejercio.poo1;



public class Profesor {
	
	public void ponerNota(Alumno a){
		a.getA1().setCalificacion(Math.random()*10.0);
		a.getA2().setCalificacion(Math.random()*10.0);
		a.getA3().setCalificacion(Math.random()*10.0);
	}
	public double calculaMedia(Alumno a){

		return((a.getA1().getCalificacion() +a.getA2().getCalificacion() +a.getA3().getCalificacion())/3);
	}

}
