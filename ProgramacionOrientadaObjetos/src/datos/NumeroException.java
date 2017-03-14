package datos;

public class NumeroException extends Exception {

	private String mensaje;
	private int numero;
	public NumeroException(String mensaje, int numero) {
		super();
		this.mensaje = mensaje;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return mensaje +" "+ numero;
	}
	
	
}
