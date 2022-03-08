package eJEMPLOCRUD1819;

public class Alumno {
	private String dni;
	private String nombre;
	//Constructor
	public Alumno(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	//Getters & Setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//To String
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	
}
