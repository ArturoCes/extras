package intento;

public class Producto {
	private int cantidad;
	private int precio;
	private String nombre;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int cantidad, int precio, String nombre) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Producto [Cantidad=" + cantidad + ", Precio=" + precio + ", Nombre=" + nombre + "]";
	}
	public boolean isEmpty () {
		return this.cantidad==0&& this.precio==0 &&this.nombre=="";
		
	}
	
	
	
}
