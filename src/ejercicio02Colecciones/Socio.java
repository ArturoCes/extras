package ejercicio02Colecciones;

public class Socio {
	
	private String nombre;
	private String apellidos;
	private String email;
	private String dni;
	private int edad;
	
	//Constructor
	
	public Socio(String nombre, String apellidos, String email, int edad,String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.edad = edad;
		this.dni=dni;
	}
	// Getters & Setters

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	//To String
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", dni=" + dni + ", edad="
				+ edad + "]";
	}
	
	
}
