package datos;

public class AlgoritmoDiferencia implements Algoritmo {
	private int num;
	
	public AlgoritmoDiferencia(int num) {
		super();
		this.num = num;
	}

	@Override
	public int Encriptar(int param) {
		return num - param;
	}

	@Override
	public int Desencripar(int param) {
		return num + param;
	}

}
