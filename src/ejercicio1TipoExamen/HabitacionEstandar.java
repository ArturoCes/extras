package ejercicio1TipoExamen;

public class HabitacionEstandar {
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDias;
	private int numOcupantes;
	
	//Constructor
	public HabitacionEstandar(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.numOcupantes = numOcupantes;
	}
	//Getters & Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}
	//To String 
	@Override
	public String toString() {
		return "HabitacionEstandar [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente="
				+ nombreCliente + ", numDias=" + numDias + ", numOcupantes=" + numOcupantes + "]";
	}
	
	public double calcularPrecio(int porcentaje,double precio) {
		
		return precioBase*numDias;	
	}
	
	
	
}
