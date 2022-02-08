package ejercicio03Array;

public class Movil {
	private String marca;
	private String modelo;
	private boolean estaVendido;
	private int precioUnitario;
	
	public Movil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movil(String marca, String modelo, boolean estaVendido, int precioUnitario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.estaVendido = estaVendido;
		this.precioUnitario = precioUnitario;
	}
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
	public boolean isEstaVendido() {
		return estaVendido;
	}
	public void setEstaVendido(boolean estaVendido) {
		this.estaVendido = estaVendido;
	}
	public int getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", estaVendido=" + estaVendido + ", precioUnitario="
				+ precioUnitario + "]";
	}	
}
