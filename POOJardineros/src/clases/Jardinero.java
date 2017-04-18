package clases;

public class Jardinero extends Empleados {
	private static final double PORCENTAJE_POR_DIA_LEJOS = 0.03;
	int numDiasTrabajadosLejos;
	
	public Jardinero(String dni, double sueldoBase,int numDiasTrabajadosLejos) {
		super(dni, sueldoBase);
		this.numDiasTrabajadosLejos = 0;
	}

	@Override
	public double calculaSueldoMensual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calculaExtras() {
		return numDiasTrabajadosLejos * getSueldoBase() * PORCENTAJE_POR_DIA_LEJOS;
	}

	@Override
	public void comienzaMes() {
		// TODO Auto-generated method stub

	}
	public void añadirDiaTrabajadoLejos(){
		numDiasTrabajadosLejos++;
	}

}
