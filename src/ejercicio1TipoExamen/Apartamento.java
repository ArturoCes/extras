package ejercicio1TipoExamen;

public class Apartamento extends HabitacionEstandar implements ILimpieza{

	private boolean contratarLimpieza;
	
	//Constructor
	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes,
			boolean contratarLimpieza) {
		super(precioBase, ocupada, nombreCliente, numDias, numOcupantes);
		this.contratarLimpieza = contratarLimpieza;
	}
	//Getters & Setters

	public boolean isContratarLimpieza() {
		return contratarLimpieza;
	}

	public void setContratarLimpieza(boolean contratarLimpieza) {
		this.contratarLimpieza = contratarLimpieza;
	}
	//To String

	@Override
	public String toString() {
		return super.toString()+"Apartamento [contratarLimpieza=" + contratarLimpieza + "]";
	}
	public double calcularPrecioLimpieza (double precio) {
		if(contratarLimpieza) {
			return getNumDias()*precio;
		}else {
			return getNumDias();
		}
		
	}
	public double calcularPrecio (int descuento,double precio) {
		return getPrecioBase()+calcularPrecioLimpieza(precio);
	}
	
}
