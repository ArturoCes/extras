package ejercicio06COLECCIONES;

import java.util.Objects;

import EjemploOrdenarUD5.EjemploOrdenarUD5.src.ejemplocomparator.Corredor;
import ejercicio05COLECCIONES.Persona;

public class Trabajador  implements Comparable <Trabajador>{
	private String nombre;
	private String dni;
	private int horasTrabajadas;
	private double sueldoFinal;
	
	//Constructor
	public Trabajador(String nombre, String dni, int horasTrabajadas, double sueldoFinal) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}
	//Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}
	//To String

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoFinal=" + sueldoFinal + "]";
	}
	//hashCode & equals

	@Override
	public int hashCode() {
		return Objects.hash(dni, horasTrabajadas, nombre, sueldoFinal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni) && horasTrabajadas == other.horasTrabajadas
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldoFinal) == Double.doubleToLongBits(other.sueldoFinal);
	}
	//Methods
	public int compareTo(Trabajador trabajador) {
		 if(horasTrabajadas<trabajador.getHorasTrabajadas()) {
			 return -1;
		 }else {
			 if(horasTrabajadas>trabajador.getHorasTrabajadas()) {
				 return 1;
			 }
			 return 0;
		 }
	}
}
