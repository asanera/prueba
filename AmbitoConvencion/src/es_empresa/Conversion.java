package es_empresa;

public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		long l;
		System.out.println("Conversi�n de enteros a bytes");
		b = (byte) i; // Casting o conversi�n explicita
		// Convierto en entero en tipo byte
		System.out.println("B: " + b + "I: " +i);
		
		System.out.println("Conversion de double a int");
		i = (int) d;
		System.out.println("D: " + d + " I: " + i);

		System.out.println("Conversi�n de int a long");
		l = i; //Casting o conversion IMPL�CITA
		// en este caso, el tipo de destino es m�s amplio que el tipo de origen no hay problema
		// Adem�s los dos tipos son compatible, no hay problemas
	}

}
