package ejercicios.excepciones;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca la matricula");
		String matricula = sc.next();
		try {
			CompruebaMatricula(matricula);
		} catch (ExMatricula e) {
			System.out.println(e);
		}
	}
	private static void CompruebaMatricula(String matricula) throws ExMatricula {
		if(MatriculaCorrecta(matricula))
			System.out.println("Matricula correcta");
		else
		throw new ExMatricula("Error", matricula);
		
	}
	private static boolean MatriculaCorrecta(String matricula) {
		if (Character.isDigit(matricula.charAt(0)))
			return false;
		else if(matricula.length() !=8 )
			return false;
		else{
			for (int i = 1; i < matricula.length(); i++) {
				if (!Character.isDigit(matricula.charAt(i)))
					return false;
			}
		}
		
		return true;
	}

}
