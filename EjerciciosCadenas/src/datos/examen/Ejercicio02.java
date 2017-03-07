package datos.examen;

import java.util.Scanner;

public class Ejercicio02 {
//	Escriba un programa que cree un array con los caracteres de la ‘a’ a la ‘z’ y a
//	continuación sustituya a todas las vocales que se encuentren en el array por el carácter
//	‘*’. 
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cuantos caracteres quieres introducir");
		int longitud = sc.nextInt();
		char[] tcaracteres = new char[longitud];
		String carac;
		for (int i = 0; i < tcaracteres.length; i++) {

			System.out.println("Introduzca el " + (i + 1) + "º caracter");
			carac = sc.next();
			tcaracteres[i] = carac.charAt(0);
		}
		tcaracteres = sustituyeVocales(tcaracteres);
		for (int i = 0; i < tcaracteres.length; i++) {

			System.out.print(tcaracteres[i] + " ");

		}

	}

	private static char[] sustituyeVocales(char[] tcaracteres) {

		for (int i = 0; i < tcaracteres.length; i++) {
			if (tcaracteres[i] == 'a' || tcaracteres[i] == 'e' || tcaracteres[i] == 'i' || tcaracteres[i] == 'o'
					|| tcaracteres[i] == 'u') {
				tcaracteres[i] = '*';
			}
		}

		return tcaracteres;
	}

}
