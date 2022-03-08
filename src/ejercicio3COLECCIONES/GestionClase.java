package ejercicio3COLECCIONES;

import java.util.Arrays;
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
	

	

	
	
	
	
	
}	
