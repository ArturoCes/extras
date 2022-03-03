package ejercicio1Colecciones;

import java.util.ArrayList;
import java.util.List;

public class VisualStudioCode {

	// Constructor
	private int idAgenda;
	private List<Notas> listaNotas;

	public VisualStudioCode(int idAgenda, List<Notas> listaNotas) {
		super();
		this.idAgenda = idAgenda;
		this.listaNotas = listaNotas;
	}

	// Getters & Setters
	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public List<Notas> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Notas> listaNotas) {
		this.listaNotas = listaNotas;
	}

	// To String
	@Override
	public String toString() {
		return "VisualStudioCode [idAgenda=" + idAgenda + ", listaNotas=" + listaNotas + "]";
	}

	public void agregarNota(Notas nota) {
		listaNotas.add(nota);
	}

	public void mostrarTamanyo() {
		System.out.println(listaNotas.size());
	}

	public void mostrarNota() {
		System.out.println(listaNotas);
	}

}
