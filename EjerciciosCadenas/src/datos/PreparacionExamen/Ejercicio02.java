package datos.PreparacionExamen;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);

	// Realizar un programa que reciba dos cadenas de caracteres y cuente el
	// número de apariciones de la primera en la segunda
	public static void main(String[] args) {
		System.out.println("Cadena 1");
		String cadena1 = sc.nextLine();
		System.out.println("Cadena 2");
		String cadena2 = sc.nextLine();
		int cont = 0, pos = 0;
    	pos = cadena1.indexOf(cadena2);
		if (pos != -1) {
			do {
				cont++;
				pos = cadena1.indexOf(cadena2, pos + cadena2.length());
			} while (pos != -1);
		}
		System.out.println("El número de ocurrencias en la cadena " + cadena1 + " de " + cadena2 + " es " + cont);
	}

}
