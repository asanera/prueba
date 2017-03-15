package datos.poo;

public class Principal01 {

	public static void main(String[] args) {
		Caja c = new Caja(2,3,5);
		Caja c1 = new Caja(2,3,6);
//		System.out.println("El volumen de la caja es: "+c.obtenerVolumen());
//		c.setAncho(20);
//		System.out.println("El volumen de la caja es: "+c.obtenerVolumen());
//		System.out.println(c);
	
		if(c.equals(c1))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
	}

}
