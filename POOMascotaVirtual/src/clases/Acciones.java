package clases;

import java.util.Scanner;

public class Acciones {

	private MascotaVirtual m;
	private static Scanner sc = new Scanner(System.in);

	public Acciones(MascotaVirtual m) {
		super();
		this.m = m;
	}

	public void comer() {
		if (m.getEnergia() == 0) {
			System.out.println("Tu mascota no tiene hambre");
			return;
		}
		System.out.print("Introduzca el tipo: Desayuno, Almuerzo, Merienda y Cena: ");
		String tipo;
		boolean ok;
		do {
			ok = true;
			tipo = sc.next();
			if (!tipo.equalsIgnoreCase("Desayuno") || !tipo.equalsIgnoreCase("Almuerzo")
					|| !tipo.equalsIgnoreCase("Merienda") || !tipo.equalsIgnoreCase("Cena")) {
				System.out.print("Error no pertenece a ningun de los tipos, introduzca de nuevo: ");
				ok = false;
			}
		} while (!ok);
		
		switch (tipo.toLowerCase()) {
		case "desayuno":
			if(comprobarNiveles(2, 2))
				return;
			else
				m.setEnergia(m.getEnergia() + 2);
			 	m.setHambre(m.getHambre()-2);
			break;

		case "almuerzo":
			if(comprobarNiveles(10, 5))
				return;
			else
				m.setEnergia(m.getEnergia() + 10);
			 	m.setHambre(m.getHambre()- 5);
			break;
		case "merienda":
			if(comprobarNiveles(2, 2))
				return;
			else
				m.setEnergia(m.getEnergia() + 2);
			 	m.setHambre(m.getHambre()- 2);
			break;
		case "cena":
			if(comprobarNiveles(3, 3))
				return;
			else
				m.setEnergia(m.getEnergia() + 3);
			 	m.setHambre(m.getHambre()- 3);
			break;
		}

	}
	private boolean comprobarNiveles(int nivelEnergia, int nivelHambre, int nivelSuciedad){
		if(m.getEnergia() +nivelEnergia > 100){
			System.out.println("As superado el nivel de energia");
			m.setEnergia(100);
		    if(m.getHambre() -nivelHambre < 0){
			System.out.println("As superado el nivel de hambre");
			m.setHambre(0);			
		    }
		    if(m.getSuciedad()+ nivelSuciedad >=100)
		    	m.muerte();
		    return true;
		 }else
			return false;
	}
}























