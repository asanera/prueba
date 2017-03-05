package datos;

import java.util.Scanner;

public class Ejercicio3 {
	// 3. Escriba un programa que lea un n�mero entero por el teclado y muestre
	//
	// en la pantalla si es un n�mero
	// abundante. Un n�mero es abundante si la suma de sus divisores es mayor
	// que
	//
	// �l. Ejemplo: 12 es abundante ya que
	// sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca un n�mero: ");
		int num = sc.nextInt();
		int suma = sumatorioDivisores(num);
		
		if (pruebAbundante(suma, num)) 
			System.out.println("El n�mero "+ num +" es abundante ya que la suma de sus divisores es: "+ suma);
		else
			System.out.println("No es abundante, debido a que la suma de sus divisores es: "+ suma);
		
		sc.close();

	}
	
	private static boolean pruebAbundante(int suma, int num) {
		if (suma > num)
		return true;
		return false;
	}

	private static int sumatorioDivisores(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num%i ==0)
				suma +=i;
		}
		return suma;
	}

}
