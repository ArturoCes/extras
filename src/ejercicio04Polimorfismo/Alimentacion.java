package ejercicio04Polimorfismo;

public class Alimentacion extends Producto{
	
	private boolean fechaCaducidad;
	

	public boolean isFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(boolean fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	/**
	 * Constructores
	 * @param precioUnitario de cada producto tipo alimenticio
	 * @param nombre de cada producto
	 * @param codigoID identificador del producto
	 * @param fechaCaducidad limite de tiempo para consumir el producto
	 */
	public Alimentacion(double precioUnitario, String nombre, int codigoID, boolean fechaCaducidad) {
		super(precioUnitario, nombre, codigoID);
		this.fechaCaducidad = fechaCaducidad;
	}
	//To String
	@Override
	public String toString() {
		return super.toString()+"Alimentacion [fechaCaducidad=" + fechaCaducidad + "]";
	}
	@Override
	public double calcularImpuestos (double impuestoAli,double impuestoEle,double impuestoRopa) {
		double porcentaje=5;
		double den=100;
		int uno = 1 ;
		impuestoAli= impuestoAli/den;
		return impuestoAli*super.getPrecioUnitario();	
	
	}
	public double calcularPrecioFinal (double impuestoAli) {
		double porcentaje=0.2;
		double descuento=0;
		double e=0;
		if (fechaCaducidad) {
			descuento=super.getPrecioUnitario()*porcentaje;
			return super.getPrecioUnitario()+calcularImpuestos(impuestoAli, e, e)-descuento;
		}else {
			return super.getPrecioUnitario()+calcularImpuestos(impuestoAli,e,e);
		}
		
	}
	

	
}
