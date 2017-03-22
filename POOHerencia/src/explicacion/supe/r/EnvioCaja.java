package explicacion.supe.r;

public class EnvioCaja extends PesoCaja {

	private double coste;
	public EnvioCaja(double ancho, double alto, double largo, double peso, double coste) {
		super(ancho, alto, largo, peso);
		this.coste = coste;
	}
	
}
