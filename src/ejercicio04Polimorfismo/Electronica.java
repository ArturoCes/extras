package ejercicio04Polimorfismo;

public class Electronica extends Producto{
	
	private String marca;
	/**
	 * Getters & Setters
	 * @return
	 */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * Constructores
	 * @param precioUnitario
	 * @param nombre
	 * @param codigoID
	 * @param marca
	 */
	public Electronica(double precioUnitario, String nombre, int codigoID, String marca) {
		super(precioUnitario, nombre, codigoID);
		this.marca = marca;
	}
	@Override
	public String toString() {
		return super.toString()+"Electronica [marca=" + marca + "]";
	}
	public double calcularImpuestos (double impuestoAli, double impuestoEle, double impuestoRopa) {
		int den=100;
		impuestoEle=impuestoEle/den;
		return impuestoEle*super.getPrecioUnitario();
		
	}
	public double calcularPrecioFinal(double impuestoBase) {
		return super.getPrecioUnitario()+calcularImpuestos(impuestoBase, impuestoBase, impuestoBase);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
