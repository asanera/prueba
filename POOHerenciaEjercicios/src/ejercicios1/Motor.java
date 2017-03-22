package ejercicios1;

public class Motor {
	private int litrosAceite, cv;
	private Motor(int cv){
		this.cv = cv;
		this.litrosAceite = 0;
		
	}
	public int getLitrosAceite() {
		return litrosAceite;
	}
	public void setLitrosAceite(int litrosAceite) {
		this.litrosAceite = litrosAceite;
	}
	public int getCv() {
		return cv;
	}
	
}
