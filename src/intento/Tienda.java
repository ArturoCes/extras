package intento;

public class Tienda {
	
	Producto producto;

	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tienda(Producto producto) {
		super();
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Tienda [producto=" + producto + "]";
	}
	
	
	public void actualizarInventario (int cantidad) {
		this.producto.setCantidad(this.producto.getCantidad()+cantidad);
	
		}
	}
