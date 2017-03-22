package explicacion.herencia;

public class Segunda extends Primera {

	public int k;
	public int i;
	public Segunda() {
		// TODO Auto-generated constructor stub
	}
	public Segunda(int valor1, int valor2) {
		super.i = valor1;
		this.i = valor2;
	}
	
	public void mostrark(){
		System.out.println(k);
	}
	public void suma() {
		System.out.println("Summa: "+ (i+j+k));
	}
}
