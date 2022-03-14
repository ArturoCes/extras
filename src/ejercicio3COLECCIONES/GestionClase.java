package ejercicio3COLECCIONES;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class GestionClase {
	
	private Set <Alumno> lista;
	private String nombreClase;
	
	//Constructor
	public GestionClase(Set<Alumno> lista, String nombreClase) {
		super();
		this.lista = lista;
		this.nombreClase = nombreClase;
	}
	//Getters & Setters
	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	public String getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	//To String
	@Override
	public String toString() {
		return "GestionClase [lista=" + lista + ", nombreClase=" + nombreClase + "]";
	}
	
	public void agregarAlumnoNuevo(Alumno alumno) {
		lista.add(alumno);
	}
	
	public void buscarAlumno(String nombre,String nombreNuevo) {
		for (Alumno alumno : lista) {
			if(alumno.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Alumno encontrado");
				alumno.modificarNombre(nombreNuevo);
				
				
			}else {
				System.out.println("No se ha encontrado");
			}
		
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(lista, nombreClase);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GestionClase other = (GestionClase) obj;
		return Objects.equals(lista, other.lista) && Objects.equals(nombreClase, other.nombreClase);
	}
	
	}
	
	

	
	
	
	
	
	
