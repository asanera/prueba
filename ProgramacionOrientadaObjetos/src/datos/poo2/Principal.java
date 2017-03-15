package datos.poo2;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta("Mi nombre", "123456789", 40000, 3.5);
		
		c1.setNombre("Otro nombre");
		c1.setCcc("984762361");
		c1.setSaldo(20000);
		c1.setTipoDeInteres(2.2);
		
		c1.ingresar(40);
		c2.reintregro(30);
		System.out.println(c1);
		System.out.println(c2);

	}

}
