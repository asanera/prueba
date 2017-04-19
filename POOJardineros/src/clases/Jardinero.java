package clases;

public class Jardinero extends Empleados {
	private static final double PORCENTAJE_POR_DIA_LEJOS = 0.03;
	private int numDiasTrabajadosLejos;
	
	public Jardinero(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		this.numDiasTrabajadosLejos = 0;
	}

	@Override
	public double calculaSueldoMensual() {
		return calculaExtras() + getSueldoBase();
	}

	@Override
	protected double calculaExtras() {
		return numDiasTrabajadosLejos * getSueldoBase() * PORCENTAJE_POR_DIA_LEJOS;
	}

	@Override
	public void comienzaMes() {
		numDiasTrabajadosLejos = 0;

	}
	public void añadirDiaTrabajadoLejos(){
		numDiasTrabajadosLejos++;
	}

	@Override
	public String toString() {
		return "Jardinero [numDiasTrabajadosLejos=" + numDiasTrabajadosLejos + ", calculaSueldoMensual()="
				+ calculaSueldoMensual() + ", getDni()=" + getDni() + ", getSueldoBase()=" + getSueldoBase() + "]";
	}

	
	
	
	
}
