package ejercicioHerencia1;

public class Tablet extends Ordenador {

	private double precioSeguro;

	public Tablet(String capacidadDiscoDuro, double frecuenciaProcesador, double precioBase, double precioSeguro) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase);
		this.precioSeguro = precioSeguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString()+"Tablet [precioSeguro=" + precioSeguro + "]";
	}
	
	public double calcularPrecio() {
		
		return precioSeguro=super.calcularPrecio()+precioSeguro;
	}
	
}
