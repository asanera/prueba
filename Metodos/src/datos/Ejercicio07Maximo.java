package datos;

import java.util.Scanner;

public class Ejercicio07Maximo {
//	2. Dise�ar un m�todo que tenga como par�metros dos n�meros, y que calcule el m�ximo.
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {

		System.out.println("N�: ");
		int num = sc.nextInt();
		System.out.println("N�: ");
		int num2 = sc.nextInt();
		
		System.out.println("El mayor es: "+ orden(num, num2));
		sc.close();
	}

	private static int orden(int num, int num2) {
		if (num > num2)
			return num;
		else return num2;
		
	}

}
