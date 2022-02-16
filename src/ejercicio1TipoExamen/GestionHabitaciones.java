package ejercicio1TipoExamen;

import java.util.Arrays;

public class GestionHabitaciones {
	
	HabitacionEstandar h [];
	
	//Constructor 
	public GestionHabitaciones(HabitacionEstandar[] h) {
		super();
		this.h = h;
	}
	//Getters & Setters
	public HabitacionEstandar[] getH() {
		return h;
	}

	public void setH(HabitacionEstandar[] h) {
		this.h = h;
	}
	//To String
	@Override
	public String toString() {
		return "GestionHabitaciones [h=" + Arrays.toString(h) + "]";
	}
	
	public void mostrarHabitaciones() {
		for (int i = 0; i < h.length; i++) {
		System.out.println(h[i]);
		}
	}
	public double recaudacionTotal (int contador,int porcentaje, double precio) {
		double suma=0;
		for (int i = 0; i<contador;i++) {
			if(h[i].isOcupada()) {
			suma=suma+h[i].calcularPrecio(porcentaje, precio);
			}
		}
		return suma;
		
			
	}
}

