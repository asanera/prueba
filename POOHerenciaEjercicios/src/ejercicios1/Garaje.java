package ejercicios1;

public class Garaje {
	private Coche coche;
	private String averia;
	private int numCochesAten;
	
	public boolean aceptarCoche(Coche c, String averia){

		if(numCochesAten == 1)
			return false;
		else{
			this.averia = averia;
			this.coche = c;
			this.numCochesAten = 1;
			if(averia.equals("aceite"))
				
		}
		return true;
	}
	public void devolverCoche(){
		this.coche= null;
		this.averia = "";
		this.numCochesAten=0;
	}
}
