package datos;

public class Excepciones2 {

	public static void main(String[] args) {
		try {
			meotodo();
		} catch (Exception e) {
			System.out.println("Eception "+e);
		}finally {
			System.out.println("Siembre va a pasar");
		}

	}

	private static void meotodo() throws NullPointerException {
//		try {
			throw new NullPointerException("mensaje");//--> Lanza la expcion
//		} catch (NullPointerException e) {
//			System.out.println("Exepcion capturada");
//			throw e;//-->Lanza otra vez la excepcion
//		}
		
	}

}
