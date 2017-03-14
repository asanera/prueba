package ejercicios.excepciones;

import java.util.Scanner;

public class Ejercicio01 {
//	Crear una clase llamada NumberDivision. Esta clase contendrá un método que aceptará dos Strings, y
//	realizará la división entre estos. Usar el método parseInt() de la clase Integer para transformar de String a
//	int. Si los Strings no son números válidos se genera un NumberFormatException. Esta excepción debe
//	ser capturada y debe ser mostrado un mensaje de error. El segundo número es usado para dividir el primer
//	número. Si el segunda número es cero, una excepción ArithmeticException es lanzada. Esta excepción
//	debe ser atrapada y un mensaje de error debe ser mostrado. 
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			System.out.println("Introduzca el primer numero");
			String num1 = sc.next();
			
			System.out.println("Introduzca el segundo numero");
			String num2 = sc.next();
			
			System.out.println("La division es "+ Integer.parseInt(num1)/Integer.parseInt(num2));
		} catch (NumberFormatException e) {
			System.out.println("Error los valores deben de ser numeros enteros");
		}catch (ArithmeticException e) {
			System.out.println("No se puede dividir un número entre zero");
		}catch (Exception e) {
			System.out.println("Error desconocido");
		}
		
	}

}
