package ejercicio.explicacion;

public class CuentaCorriente {

	private Titular titular;
	private String ccc;
	private double saldo;
	
	public CuentaCorriente(Titular titular, String ccc, double saldo) {
		super();
		this.titular = titular;
		this.ccc = ccc;
		this.saldo = saldo;
		
	}

	public CuentaCorriente(Titular titular, String ccc) {
//		this.titular = titular;
//		this.ccc = ccc;
//		this.saldo = 15.3;
		this(titular,ccc,15.3);
	}
	public String getCcc() {
		return ccc;
	}
	public double getSaldo() {
		return saldo;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void ingresar(double cantidad){
		saldo += cantidad;
	}
	public void reintegro (double cantidad){
		saldo -= cantidad;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [ccc=" + ccc + ", saldo=" + saldo + "]";
	}
	public boolean equals(CuentaCorriente c){
		if(this.ccc.compareTo(c.getCcc())==0)
			return true;
			return false;
	}
}





































