package ejercicio04Polimorfismo;

public class Ropa extends Producto{
	
	private String talla;
	private String color;
	/**
	 * Getters & Setters
	 * @return
	 */
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Constructores
	 * @param precioUnitario
	 * @param nombre
	 * @param codigoID
	 * @param talla
	 * @param color
	 */
	public Ropa(double precioUnitario, String nombre, int codigoID, String talla, String color) {
		super(precioUnitario, nombre, codigoID);
		this.talla = talla;
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString()+"Ropa [talla=" + talla + ", color=" + color + "]";
	}
	
	public double calcularImpuestos (double impuestoAli,double impuestoEle, double impuestoRopa) {
		double den=100;
		int uno =1;
		impuestoRopa=impuestoRopa/den;
		return impuestoRopa+super.getPrecioUnitario();
	}
	public double calcuarPrecioFinal (double p) {
		return super.getPrecioUnitario()+calcularImpuestos(p, p, p);
		

	}
	

}
