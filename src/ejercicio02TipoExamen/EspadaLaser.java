package ejercicio02TipoExamen;

public class EspadaLaser extends Producto {
	private String tipo;

	// Constructor
	protected EspadaLaser(double precioBase, int cantidad, String nombre, boolean vendido, String tipo) {
		super(precioBase, cantidad, nombre, vendido);
		this.tipo = tipo;
	}
	// Getters & Setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// To String
	@Override
	public String toString() {
		return super.toString() + "EspadaLaser [tipo=" + tipo + "]";
	}

	// Methods
	public double calcularPVP(double ganancia,double fijo) {
		String tipoEsp = "double";
		if (tipo.equalsIgnoreCase(tipoEsp)) {
			return getPrecioBase() + ganancia + fijo;
		} else {
			return getPrecioBase() + ganancia;
		}

	}
	public void imprimirMensaje () {
		System.out.println("Cuidaó que hace pupita");
	}
}