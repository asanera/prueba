package ejercicios1;

public class Coche {
	private Motor motor;
	private String marca, modelo;
	private double precioYAverias;
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getPrecioYAverias() {
		return precioYAverias;
	}
	public void acumularAveria(double averia){
		precioYAverias += averia;
	}
}
