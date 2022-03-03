package ejercicio02Colecciones;

import java.util.Arrays;
import java.util.List;

import ejercicio1Colecciones.Notas;

public class GestionClub {
	private int idClub;
	private List<Socio> listaSocios;
	private String direccion;

	// Constructor

	public GestionClub(int idClub, List<Socio> listaSocios, String direccion) {
		super();
		this.idClub = idClub;
		this.listaSocios = listaSocios;
		this.direccion = direccion;
	}

	// Getters & Setters

	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	// To String

	@Override
	public String toString() {
		return "GestionClub [idClub=" + idClub + ", listaSocios=" + listaSocios + ", direccion=" + direccion + "]";
	}
	
	public void agregarSocio (Socio unsocio) {
		listaSocios.add(unsocio);
	}
	public void mostrarSocios(int indice) {
		System.out.println(indice+":"+listaSocios);
	}
	public void mostrarUnSocio (int indice) {
		System.out.println(listaSocios.get(indice));
	}
	public Socio buscarSocio (int indice) {
		return listaSocios.get(indice-1);
	}
	public Socio buscarSoloUnSocio (int indice) {
		return listaSocios.get(indice);
	}
	public void eliminarSocio (Socio s) {
		listaSocios.remove(s);
	}
}
