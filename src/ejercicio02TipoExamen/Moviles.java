package ejercicio02TipoExamen;

public class Moviles extends Producto {

	private String marca;
	private String modelo;

	// Constructor
	protected Moviles(double precioBase, int cantidad, String nombre, boolean vendido, String marca, String modelo) {
		super(precioBase, cantidad, nombre, vendido);
		this.marca = marca;
		this.modelo = modelo;
	}
	// Getters & Setters
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	

	// To String
	@Override
	public String toString() {
		return super.toString() + "Moviles [marca=" + marca + ", modelo=" + modelo + "]";
	}




	// Methods
	public double calcularPVP(double ganancia) {
		return getPrecioBase() + ganancia;
	}
}
