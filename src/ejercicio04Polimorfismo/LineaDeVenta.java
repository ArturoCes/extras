package ejercicio04Polimorfismo;

public class LineaDeVenta {
 private Producto producto;
 private int cantidad;
 
	public LineaDeVenta(Producto producto, int cantidad) {
		super();
		this.producto= producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	
 
}
