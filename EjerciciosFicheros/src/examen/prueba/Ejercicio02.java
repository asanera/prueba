package examen.prueba;

import java.util.Scanner;

public class Ejercicio02 {

	//Crear una clase que permita cifrar cadenas de caracteres usando el algoritmo de cifrado
	//simple consistente en asignar a cada carácter aquel que resulte de sumar un valor a su
	//código ASCII. (La asignación será circular, es decir, si el valor es 2, al carácter “z” le
	//corresponderá la “b”)
	private static Scanner sc = new Scanner (System.in);
	private static final int clave = 2;
	public static void main(String[] args) {
		System.out.println("Introduzca la cadena: ");
		String cadena = sc.nextLine();
		int [] tcaracter = new int[cadena.length()];
		
		for (int i = 0; i < tcaracter.length; i++) {
			if((cadena.codePointAt(i) + clave) > 112)
			tcaracter[i] = cadena.codePointAt(i) + clave -58;
			else 
		    tcaracter[i] = cadena.codePointAt(i) + clave;
			System.out.println(tcaracter[i]+ " = " + (char)tcaracter[i]);
		}
		for (int i = 0; i < tcaracter.length; i++) {
			if((tcaracter[i] - clave)<65)
				System.out.println((char)(tcaracter[i]+ 58+clave));
				else 
				System.out.println((char)(tcaracter[i]+ clave));
		}
		

	}

}
