package ejercicio4COLECCIONESHASHMAP;

import java.util.Iterator;
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
	public void addContacto(Contacto contacto, String telefono) {
		lista.put(contacto, telefono);
	}
	public Contacto buscarPorNombre(String nuevoNombre) {
		Iterator <Contacto> it = lista.keySet().iterator();
		Contacto tmp =null;
		boolean encontrado=false;
		while(it.hasNext() && !encontrado) {
			tmp= it.next();
			if(tmp.getNombre().equalsIgnoreCase(nuevoNombre)) {
				encontrado=true;
				return tmp;
			}
		}
		return null;
	}
}
	
