package datos;

import java.util.Scanner;

public class Baloncesto {
	private static Scanner sc = new Scanner(System.in);
	// Un club de baloncesto saca a la venta las entradas para el pr�ximo
	// partido. El precio de las entradas var�a dependiendo de la zona del
	// pabell�n que el espectador quiere ocupar. El precio de una entrada para
	// la zona de los fondos es de 5 euros. Si un aficionado adquiere m�s de 7
	// entradas para esta zona obtiene un descuento total del 6%. El precio de
	// una entrada para la zona central es de 12 euros. Si un aficionado
	// adquiere m�s de 5 entradas para esta zona obtiene un descuento total del
	// 5%. El precio de una entrada para la zona VIP es de 20 euros. Si un
	// aficionado adquiere m�s de 9 entradas para esta zona obtiene un descuento
	// total del 4%. Dise�e una aplicaci�n que muestre un men� con las tres
	// zonas del pabell�n, el usuario deber�a escoger la zona del pabell�n para
	// la que desea adquirir entradas. A continuaci�n la aplicaci�n pedir� al
	// usuario que introduzca el n�mero de entradas que quiere adquirir.
	// Posteriormente el programa mostrar� por pantalla el importe en euros que
	// el aficionado debe abonar. Utilice la clase Scanner para leer los datos
	// por teclado y el m�todo printf para mostrar la salida del programa por
	// pantalla

	public static void main(String[] args) {
		int menu, entradas;
		double precio = 0;
		//Entro en el men�
		do {
			System.out.println("Eliga la opci�n del menu que desee: ");
			System.out.println("1.Fondo || 2. Centro || 3.Vip");
			menu = sc.nextInt();
			if (menu < 1 || menu > 3)
				System.out.println("Error en el valor");
		} while (menu < 1 || menu > 3);
		//El usuario coloca el numero de entradas que desea y comprueba que es correcto
		do {
			System.out.println("introduzca el n�mero de entradas que desee: ");
			entradas = sc.nextInt();
		} while (entradas <= 0);
		//Evalua el men� aplicando su descuentos.
		switch (menu) {
		case 1:

			if (entradas > 7) 
				precio = entradas * 5 * 0.6;
						
			 else 
				precio = entradas * 5;
				
			break;	
			
		case 2:
			
			if (entradas > 5) 
				precio = entradas * 12 * 0.5;
						
			 else 
				precio = entradas * 12;
							 
			break;
		
		case 3:
			
			if (entradas > 9) 
				precio = entradas * 20 * 0.4;
							
			else 
				precio = entradas * 20;
				
			break;
			
			
		}
		//Muestra en panta�a lo que el usuario debe de pagar.
		System.out.println("Usted debe de pagar: " + precio + "�");
		
		sc.close();
	}
}
