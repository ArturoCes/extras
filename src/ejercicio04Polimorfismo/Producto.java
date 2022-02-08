package ejercicio04Polimorfismo;

public class Producto {
	/**Atributos
	 * Acá se declaran los atributos 
	 */
	private double precioUnitario;
	private String nombre;
	private int codigoID;
	
	/**
	 *Getters & Setters 
	 * @return
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigoID() {
		return codigoID;
	}
	public void setCodigoID(int codigoID) {
		this.codigoID = codigoID;
	}
	/**
	 * 
	 * @param precioUnitario es el precio base por unidad de un producto
	 * @param nombre del producto
	 * @param codigoID es el número identificador de un producto
	 */
	public Producto(double precioUnitario, String nombre, int codigoID) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.codigoID = codigoID;
	}
	/**
	 * To string de producto
	 */
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codigoID=" + codigoID + "]";
	}
	
	public double calcularImpuestos (double impuestoAli,double impuestoEle,double impuestoRopac) {
		return 0;
	}
	public double calcularPrecioFinal (double impuestoBase) {
		return 0;
		
	}

	
	
	
}
