package datos;

import java.util.Scanner;

public class Ejercicio06ModuloEjecutandose {
//	1. Realizar un m�todo, que se le pase como par�metro un n�mero N, y muestre por pantalla N veces, el mensaje: �M�dulo Ejecut�ndose�
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("N�: ");
		int numero = sc.nextInt();
		moduloEjectuta(numero);
      sc.close();
	}
	private static void moduloEjectuta(int numero) {
		for (int i = 1; i <= numero; i++)
			System.out.println("Modulo Ejecutandose");
	}

}
