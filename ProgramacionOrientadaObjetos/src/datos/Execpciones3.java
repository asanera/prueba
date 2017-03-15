package datos;

public class Execpciones3 {

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			try {
				imprimeNumero(i);
			} catch (NumeroException e) {
				System.out.println(e);
			}
			
		}
		
	}

	private static void imprimeNumero(int i) throws NumeroException {//-->Este metodo puede lanzar la excepcion
		if (i<10)		
			System.out.println(i);
		else{
			throw new NumeroException("Imposible Imprimir",i);
		}
			
	}

}
