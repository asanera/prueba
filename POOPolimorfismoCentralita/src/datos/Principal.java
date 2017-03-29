package datos;

public class Principal {

	public static void main(String[] args) {
		Centralita c = new Centralita();
		
		Llamada local = new LlamadaLocal("123", "456", 45);
		c.registrarLlamada(local);
		
		Llamada provincial = new LlamadaProvincial("789", "936", 178, 2);
		c.registrarLlamada(provincial);
		
		System.out.println("Nº de Llamadas: "+c.getContador());
		System.out.println("Facturado: "+ c.getFacturado());

	}

}
