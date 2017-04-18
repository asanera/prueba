package main;

import clases.Autobus;
import clases.Conductor;
import clases.Interurbano;
import clases.Urbano;

public class Principal {

	public static void main(String[] args) {
		Autobus a1 = new Urbano(1,new Conductor("Alvaro Sanchez",1200),0.4,"B");
		System.out.println("A1 "+a1.toString());
		System.out.println("Precio billete de A1: "+ a1.precioBillete()+"€");
		
		Autobus a2 = new Interurbano(2,new Conductor("Jose Antonio", 1500),0.05, 1000);
		System.out.println("A2 "+a2.toString());
		System.out.println("Precio billete de A2: "+ a2.precioBillete()+"€");

	}

}
