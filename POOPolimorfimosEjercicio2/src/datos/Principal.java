package datos;

public class Principal {

	public static void main(String[] args) {
		Encriptador e = new Encriptador();
		int codigo = 123;
		Algoritmo aM = new AlgoritmoMultiplicadador(10);
		int aux = e.encriptarDeEncriptador(codigo, aM);
		System.out.println("Ecnriptado "+aux);
		System.out.println("Desencriptado "+ e.desencriptarDeEncriptador(aux, aM));

	}

}
