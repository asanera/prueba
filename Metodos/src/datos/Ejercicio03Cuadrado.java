package datos;

import java.util.Scanner;

public class Ejercicio03Cuadrado {
//	. El cuadrado de un n�mero se obtiene al sumar tantos n�meros impares como indique el n�mero. La suma debe empezar con el uno (1). As�:
//		El cuadrado de 1 :
//		1 = 1
//		El cuadrado de 2 :
//		1 + 3 = 4
//		El cuadrado de 3:
//		1 + 3 + 5 = 9
//		Se debe desarrollar un programa que utilice este m�todo para calcular el cuadrado de cualquier n�mero entero.
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		do{
		System.out.println("N�: ");
		 numero= sc.nextInt();
		System.out.println("El cuadrado de "+ numero + " es "+ calcularCuadrado(numero));
		}while(numero<1);
		sc.close();
	}
	private static int calcularCuadrado(int numero) {
		int cuadrado = 0;
		int contador = 1;
		for (int i = 1; i < numero; i++) {
			cuadrado = cuadrado + contador;
			contador +=2;
		}
		
		
		return cuadrado;
	}

}
