package clases;

public class ComercialVisitante extends Comercial {

	private static final double PORCENTAJE_POR_VISITA = 0.01;
	private int numVisitasRealizadas;
	
	public ComercialVisitante() {
		// TODO Auto-generated constructor stub
	}

	public ComercialVisitante(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		numVisitasRealizadas = 0;
	}

	@Override
	protected double calculaExtras() {
		// TODO Auto-generated method stub
		return getNumClientesConseguidos() * getSueldoBase() * 0.05 + numVisitasRealizadas * getSueldoBase() * 0.01;
	}
	public void añadirVisitaRealizada(){
		numVisitasRealizadas++;
	}

	@Override
	public double calculaSueldoMensual() {
		return calculaExtras() + getSueldoBase();
	}

	@Override
	public String toString() {
		return "ComercialVisitante [numVisitasRealizadas=" + numVisitasRealizadas + ", calculaSueldoMensual()="
				+ calculaSueldoMensual() + ", getNumClientesConseguidos()=" + getNumClientesConseguidos()
				+ ", getDni()=" + getDni() + ", getSueldoBase()=" + getSueldoBase() + "]";
	}
	
	
	

	

	

	
}
