package datos;

public class AlgoritmoMultiplicadador implements Algoritmo {

	private int numero;
	
	public AlgoritmoMultiplicadador(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public int Encriptar(int param) {		
		return param* numero;
	}

	@Override
	public int Desencripar(int param) {
		return param/ numero;
	}

}
