package datos.PreparacionExamen;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca una cadena");
		String cadena = sc.nextLine();
		//Paso caracter a mayuscula
		System.out.println(cadena.toUpperCase());
		//Paso la cadena en minuscula
		System.out.println(cadena.toLowerCase());
		//Cojo los dos primero caracter de la cadena
		if (cadena.length() >1)
			System.out.println(cadena.substring(0, 2));
		else
			System.out.println("No se puede coger los dos primeros caracter");
		//Cojo los dos ultimos caracter de la cadena
		if (cadena.length() >1)
			System.out.println(cadena.substring(cadena.length()-2));
		else
			System.out.println("La cadena contiene meno de dos caracteres");
		//Numeros de ocurrencia del ultimo caracter
		int cont = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == cadena.charAt(cadena.length()-1))
				cont++;
		}
		System.out.println("El numero de ocurrencias de la letra "+cadena.charAt(cadena.length()-1)+" es "+ cont);
		//La cadena con todas la ocurrencias con el primer caracter en mayusculas
			System.out.println(cadena.replaceAll(cadena.substring(0,1), cadena.substring(0,1).toUpperCase()));
		//La cadena con tres astericos por delante y por detras
			StringBuffer cad = new StringBuffer(cadena);
			System.out.println(cad.append("***"));
			System.out.println(cad.insert(0, "***"));
		//La cadena invertida
			System.out.println(cad.reverse());
	}
}



























