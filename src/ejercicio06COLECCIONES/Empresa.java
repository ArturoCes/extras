package ejercicio06COLECCIONES;

import java.util.List;

public class Empresa {
	
	private List <Trabajador>lista;
	private String direccion;

	//Constructor
	public Empresa(List<Trabajador> lista, String direccion) {
		super();
		this.lista = lista;
		this.direccion = direccion;
	}
	//Getters & Setters

	public List<Trabajador> getLista() {
		return lista;
	}

	public void setLista(List<Trabajador> lista) {
		this.lista = lista;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//To String

	@Override
	public String toString() {
		return "Empresa [lista=" + lista + ", direccion=" + direccion + "]";
	}
	public void mostrarLista () {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getDni());	
		}
		}
	}
	

