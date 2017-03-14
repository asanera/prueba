package datos.examen;

import java.util.Scanner;

public class Ejercicio01 {
//	 Escriba una aplicación que lea una línea de texto, que divida la línea en tokens
//	 utilizando caracteres de espacio como delimitadores, y que imprima sólo aquellas palabras
//	 que comiencen con la letra “b”.
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca la cadena");
		String cadena = sc.nextLine();
		
		String [] partes = cadena.split(" ");
		for (int i = 0; i < partes.length; i++) {
			if(partes[i].charAt(0) == 'b')
			System.out.println(partes[i]);
		}

	}

}
