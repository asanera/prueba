package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio08 {
//	Dado el siguiente fichero de conductores de camiones de la empresa Altair S.A.:
//	id01234; Antonio Perez Pozo; 1234ASD; 654321321; español; 200,2; 113,3; 98,4; 546,5

//	Genere un fichero por cada uno de los conductores, de nombre el identificador del conductor
//	sin el id, que muestre su información de la siguiente forma:

//	Nombre: Antonio Perez Pozo
//	Matrícula: 1234ASD
//	Teléfono: 654321321
//	Nacionalidad: español
//	Media Kilómetros: 239,6 km
// Ampliación
public static void main(String[] args) {
	File fichero = new File ("fejercicio7.txt");//-->Abro el fichero
	if(fichero.exists()){
		FileReader fw = null;
		BufferedReader br = null;
		
		try {
			fw = new FileReader(fichero);
			br = new BufferedReader(fw);
			String linea;
			
			String [] tpartes;
			while ((linea = br.readLine())!=null) {
				tpartes= linea.split(";");
				generaFichero(tpartes);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fw.close();
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}		
	
		
	}else {
		System.out.println("El fichero no existe");
	}

}

private static void generaFichero(String[] tpartes) {

File ficheroCon = new File(tpartes[0].substring(2)+".txt");
if(!ficheroCon.exists()){
	try {
		ficheroCon.createNewFile();//--> Creo el fichero
		
		FileWriter fw = null; //--> Delcaro el objeto de escritura
		BufferedWriter bw = null;//--> Delcaro el objeto de escritura del buffer
		
		//Construyo el objeto
		fw = new FileWriter(ficheroCon);
		bw = new BufferedWriter(fw);
		
		//Escribimos en el fichero
		bw.write("Nombre: " + tpartes[1].trim());
		bw.newLine();
		bw.write("Mátricula: " + tpartes[2].trim());
		bw.newLine();
		bw.write("Telefono: " + tpartes[3].trim());
		bw.newLine();
		bw.write("Nacionalidad: " + tpartes[4].trim());
		bw.newLine();
		float media = calculaMedia(tpartes);

		bw.write("Media Kilómetros: " + media);
		bw.flush();
		
		bw.close();
		fw.close();
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	
	
	
}else {
	System.out.println("El fichero ya existe");
}

}

private static float calculaMedia(String[] tpartes) {
float suma = 0;
for (int i = 5; i < tpartes.length; i++) {
	suma += Float.parseFloat(tpartes[i].trim().replace(',', '.'));
}
float media = suma /(tpartes.length -5);
return media;
}

}
