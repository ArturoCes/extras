package ejercicio05COLECCIONES;

import java.util.Map;

public class Casa {
	
	private Map<Persona,String>lista;

	//Constructor
	public Casa(Map<Persona, String> lista) {
		super();
		this.lista = lista;
	}
	//Getters & Setters

	public Map<Persona, String> getLista() {
		return lista;
	}

	public void setLista(Map<Persona, String> lista) {
		this.lista = lista;
	}
	//To String

	@Override
	public String toString() {
		return "Casa [lista=" + lista + "]";
	}
	
	
}
