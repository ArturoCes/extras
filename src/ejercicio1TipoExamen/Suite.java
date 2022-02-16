package ejercicio1TipoExamen;

public class Suite extends HabitacionEstandar{
	private double m2;
	private double cantDinExtra;
	
	//Constructor
	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numOcupantes, double m2,
			double cantDinExtra) {
		super(precioBase, ocupada, nombreCliente, numDias, numOcupantes);
		this.m2 = m2;
		this.cantDinExtra = cantDinExtra;
	}
	//Getters & Setters

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getCantDinExtra() {
		return cantDinExtra;
	}

	public void setCantDinExtra(double cantDinExtra) {
		this.cantDinExtra = cantDinExtra;
	}
	//To String

	@Override
	public String toString() {
		return super.toString()+"Suite [m2=" + m2 + ", cantDinExtra=" + cantDinExtra + "]";
	}
	public double calcularPrecio (int porcentaje,double precio) {
		int den = 100;
		double descuento=(porcentaje/den)*getPrecioBase();
		return ((getNumDias()*getPrecioBase())+cantDinExtra)-descuento;
	}
	
	
}
