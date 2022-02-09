package ejercicioP;

public class Deposito {
	/**
	 * Atributos
	 */
	private double altura;
	private double radio;
	private int contenido;
	private double precioBase;
	/**
	 * 
	 * @param altura del depósito
	 * @param radio del depósito
	 * @param contenido actual del depósito
	 */
	public Deposito(double altura, double radio, int contenido,double precioBase) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.contenido = contenido;
		this.precioBase=precioBase;
	}
	/**
	 * Getters&Setters
	 * @return
	 */
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	@Override
	public String toString() {
		return "Deposito [altura=" + altura + ", radio=" + radio + ", contenido=" + contenido + "]";
	}

	public double calcularVolumen () {
		int b = 2;
		return altura*Math.PI*Math.pow(radio, b);
	}
	
	
}
