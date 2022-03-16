package ejercicio05COLECCIONES;

import java.util.Objects;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	
	//Constructor
	public Persona(String dni, String nombre, String apellidos, int edad, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//To String

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", email="
				+ email + "]";
	}
	//hashCode & equals

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, edad, email, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre);
	}
	//Methods
	public int compareTo(Persona persona) {
		return (dni.compareTo(persona.getDni()));
	}
	
}
