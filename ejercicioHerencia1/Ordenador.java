package ejercicioHerencia1;

public class Ordenador {
	private String capacidadDiscoDuro;
	private double frecuenciaProcesador;
	private double precioBase;
	
	public Ordenador(String capacidadDiscoDuro, double frecuenciaProcesador, double precioBase) {
		super();
		this.capacidadDiscoDuro = capacidadDiscoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
	}

	public String getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(String capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDiscoDuro=" + capacidadDiscoDuro + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + "]";
	}
	
	public double calcularPrecio() {
		return 1000;
	}
	
	
}
