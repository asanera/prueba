package ejercicio.explicacion;

public class Principal {

	public static void main(String[] args) {
		Titular t = new Titular("YO","APE1 APE2",19);
		CuentaCorriente cc = new CuentaCorriente(t, "123456789",2000);
		CuentaAhorro ca = new CuentaAhorro(new Titular("TU","APE1 APE2",38), "98765432",5000,2.5);
		System.out.println(cc);
		System.out.println(ca);
		
		cc.reintegro(1000);
		ca.ingresar(4000);
		
		System.out.println(cc);
		System.out.println(ca);
		
		ca.calcularInteres();
		System.out.println(ca);
		
		System.out.println("¿Son iguales?: "+ cc.equals(ca));
		
		
 
	}

}
