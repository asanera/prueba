package ejercicios.excepciones;

public class ExMatricula extends Exception {

	private String mensaje;
	private String matricula;
	
	public ExMatricula(String mensaje, String matricula) {
		super();
		this.mensaje = mensaje;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return mensaje+" "+matricula;
	}
	
	
}
