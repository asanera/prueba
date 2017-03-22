package ejercicio.explicacion;

public class CuentaAhorro extends CuentaCorriente {
	private double interes;

	public CuentaAhorro(Titular titular, String ccc, double saldo, double interes) {
		super(titular, ccc, saldo);
		this.interes = interes;
	}

	public CuentaAhorro(Titular titular, String ccc, double interes) {
		super(titular, ccc, 15.3);
		this.interes = interes;
	}
	public CuentaAhorro(Titular titular, String ccc) {
		super(titular, ccc, 15.3);
		this.interes = 2.5;
	}
	public double getInteres() {
		return interes;
	}
	public void calcularInteres(){
		setSaldo(getSaldo() +getSaldo()*interes);
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + ", getCcc()=" + getCcc() + ", getSaldo()=" + getSaldo()
				+ ", getTitular()=" + getTitular() + "]";
	}



}
