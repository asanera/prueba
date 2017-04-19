package main;

import clases.ComercialTelefonico;
import clases.ComercialVisitante;
import clases.Jardinero;

public class Principal {

	public static void main(String[] args) {
		Jardinero j = new Jardinero("12345678G", 1000);
		ComercialTelefonico ct = new ComercialTelefonico("98765432H", 1200);
		ComercialVisitante cv = new ComercialVisitante("56473732B",1500);
		
		j.añadirDiaTrabajadoLejos();
		j.añadirDiaTrabajadoLejos();
		j.añadirDiaTrabajadoLejos();
		
		ct.añadirClienteConseguido();
		ct.añadirClienteConseguido();
		ct.añadirClienteConseguido();
		
		cv.añadirVisitaRealizada();
		cv.añadirVisitaRealizada();
		cv.añadirVisitaRealizada();
		cv.añadirClienteConseguido();
		
		System.out.println(j.toString());
		System.out.println(ct.toString()); 
		System.out.println(cv.toString()); 
		
	}

}
