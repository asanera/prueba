package datos;

public class Encriptador {

	public int encriptarDeEncriptador(int param, Algoritmo a){
		return a.Encriptar(param);
	}
	public int desencriptarDeEncriptador(int param, Algoritmo a){
		return a.Desencripar(param); 
	}
}
