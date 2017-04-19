package clases;

public class MascotaVirtual {

	private String nombre;
	private int energia;
	private int hambre;
	private int felicidad;
	private int suciedad;
	private boolean vivo;
	public MascotaVirtual(String nombre, int energia, int hambre, int felicidad, int suciedad, boolean vivo) {
		super();
		this.nombre = nombre;
		this.energia = energia;
		this.hambre = hambre;
		this.felicidad = felicidad;
		this.suciedad = suciedad;
		this.vivo = vivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getHambre() {
		return hambre;
	}
	public void setHambre(int hambre) {
		this.hambre = hambre;
	}
	public int getFelicidad() {
		return felicidad;
	}
	public void setFelicidad(int felicidad) {
		this.felicidad = felicidad;
	}
	public int getSuciedad() {
		return suciedad;
	}
	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "MascotaVirtual [nombre=" + nombre + ", energia=" + energia + ", hambre=" + hambre + ", felicidad="
				+ felicidad + ", suciedad=" + suciedad + ", vivo=" + vivo + "]";
	}
	
	public void muerte(){
		System.out.println("TÚ MASCOTA A MUERTO");
	}
	
}
