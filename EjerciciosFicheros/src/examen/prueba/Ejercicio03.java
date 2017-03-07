package examen.prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {
		File fichero = new File("exejercicio03.txt");
		
		if(fichero.exists()){
			FileReader fr = null;
			BufferedReader bw = null;
			try {
				fr = new FileReader(fichero);
				bw =new BufferedReader(fr);
			
				String tparte [];
				String linea;
				while((linea = bw.readLine())!=null){
					tparte = linea.split("\\|");
					System.out.println(" La id es " + tparte[0] + " la asignatura es "+ tparte[1]+ " y la nota es " + tparte[2]);
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			
		}else
			System.out.println("El fichero no existe");

	}

}
