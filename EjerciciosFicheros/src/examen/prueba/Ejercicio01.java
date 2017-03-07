package examen.prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio01 {

//	Realizar un programa que lea los caracteres de un archivo de texto pedido por
//	teclado, muestre su valor Unicode y el carácter e indique cuántos hay.
	public static void main(String[] args) {
	File fichero = new File("Exaejercicio1.txt");
	if (fichero.exists()){
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
			
			String linea;
			int cont = 0;
			while ((linea = br.readLine()) !=null) {
				for (int i = 0; i < linea.length(); i++) {
					
					System.out.print("El caracter de la letra "+ linea.charAt(i) + " es "+ linea.codePointAt(i));
					for (int j = i; j < linea.length(); j++) {
						if (linea.charAt(i) == linea.charAt(j))
							cont++;
					}
					System.out.println(" y el numero de ocurrencia en la linea es "+cont);
					cont = 0;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}else{
		System.out.println("El fichero no existe");
	}

	}

}
