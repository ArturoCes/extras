package ejercicio4COLECCIONESHASHMAP;

import java.util.Map;
import java.util.Objects;

public class Agenda {
	private Map<Contacto, String> lista;
	private String fecha;

	// Constructor
	public Agenda(Map<Contacto, String> lista, String fecha) {
		super();
		this.lista = lista;
		this.fecha = fecha;
	}
	//Getters & Setters

	public Map<Contacto, String> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	//To String

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + ", fecha=" + fecha + "]";
	}
	//Hash Code & Equals
	@Override
	public int hashCode() {
		return Objects.hash(fecha, lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(lista, other.lista);
	}
	

}
