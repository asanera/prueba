package ejercicios.excepciones;

import java.util.Scanner;

public class Ejercicio01 {
//	Crear una clase llamada NumberDivision. Esta clase contendr� un m�todo que aceptar� dos Strings, y
//	realizar� la divisi�n entre estos. Usar el m�todo parseInt() de la clase Integer para transformar de String a
//	int. Si los Strings no son n�meros v�lidos se genera un NumberFormatException. Esta excepci�n debe
//	ser capturada y debe ser mostrado un mensaje de error. El segundo n�mero es usado para dividir el primer
//	n�mero. Si el segunda n�mero es cero, una excepci�n ArithmeticException es lanzada. Esta excepci�n
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
			System.out.println("No se puede dividir un n�mero entre zero");
		}catch (Exception e) {
			System.out.println("Error desconocido");
		}
		
	}

}
