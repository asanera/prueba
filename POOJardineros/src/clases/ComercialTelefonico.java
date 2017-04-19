package clases;

public class ComercialTelefonico extends Comercial {

	public ComercialTelefonico() {
		// TODO Auto-generated constructor stub
	}

	public ComercialTelefonico(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calculaExtras() {
		
		return getNumClientesConseguidos() * getSueldoBase() * getPorcentajePorClienteConseguido();
	}
	@Override
	public double calculaSueldoMensual() {
		return calculaExtras() + getSueldoBase();
	}
	

	@Override
	public String toString() {
		return "ComercialTelefonico [calculaSueldoMensual()=" + calculaSueldoMensual()
				+ ", getNumClientesConseguidos()=" + getNumClientesConseguidos() + ", getDni()=" + getDni()
				+ ", getSueldoBase()=" + getSueldoBase() + "]";
	}

	@Override
	public void comienzaMes() {
		setNumClientesConseguidos(0);
		
	}
	
}
