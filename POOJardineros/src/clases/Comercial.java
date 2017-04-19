package clases;

public abstract class Comercial extends Empleados {

	private static final double PORCENTAJE_POR_CLIENTE_CONSEGUIDO = 0.05;
	private int numClientesConseguidos;
	
	
	
	public Comercial() {
		// TODO Auto-generated constructor stub
	}

	public Comercial(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		numClientesConseguidos = 0;
	}

	@Override
	public abstract double calculaSueldoMensual();

	@Override
	protected abstract double calculaExtras();

	@Override
	public abstract void comienzaMes();
	public void añadirClienteConseguido(){
		numClientesConseguidos++;
	}
	public int getNumClientesConseguidos() {
		return numClientesConseguidos;
	}
	public static double getPorcentajePorClienteConseguido() {
		return PORCENTAJE_POR_CLIENTE_CONSEGUIDO;
	}
	public void setNumClientesConseguidos(int numClientesConseguidos) {
		this.numClientesConseguidos = numClientesConseguidos;
	}
}
