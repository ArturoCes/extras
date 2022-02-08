package ejercicioHerencia1;

public class Portatil extends Ordenador {

	private double descuento;

	public Portatil(String capacidadDiscoDuro, double frecuenciaProcesador, double precioBase, double descuento) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return super.toString()+"Portatil [descuento=" + descuento + "]";
	}
	public double calcularPrecio() {
		
		return descuento=super.calcularPrecio()-descuento;
	}
	
}

