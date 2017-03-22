package explicacion.supe.r;

public class PesoCaja extends Caja {

	private double peso;
	
	public PesoCaja (double ancho, double alto, double largo, double peso){
		super(ancho, alto, largo);
		this.peso = peso;
	}
}
