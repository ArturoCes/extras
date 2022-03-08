package eJEMPLOCRUD1819;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Secretaria {

	private List<Alumno> listaAlumno;

	// Constructor
	public Secretaria(List<Alumno> listaAlumno) {
		super();
		this.listaAlumno = listaAlumno;
	}

	// Otro posible constructor
	// public Secretaria() {
	// listaAlumno = new ArrayList <Alumno>();
	// }
	// Getters & Setters

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}
	// To String

	@Override
	public String toString() {
		return "Secretaria [listaAlumno=" + listaAlumno + "]";
	}
	// Los métodos están hechos, por comodidad, sin comprobar si la lista está
	// vacía,
	// aspecto que deberíamos hacer como buena práctica

	public void agregarAlum(Alumno alum) {
		listaAlumno.add(alum);
	}

	// Otra versión de agregar vista en clase, devolviendo un boolean.
	// Habría que tener el imprimir mensaje de error al agregar como hemos visto en
	// clase

	public boolean agregar2(Alumno al) {

		return listaAlumno.add(al);
	}

	public int buscarAlum(String dni) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < listaAlumno.size() && !salir; i++) {
			if (listaAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}
	public List<Alumno> buscarAlumno3 (String nombre){
		
		List <Alumno>listaAux= new ArrayList <Alumno>();
		for (int i = 0; i < listaAlumno.size(); i++) {
			if (listaAlumno.get(i).getNombre().equalsIgnoreCase(nombre)) {
				listaAux.add(listaAlumno.get(i));
			}
		}
		return listaAux;
	}

	public void modificarAlumno(String dni, String nombreNuevo) {

		int index = buscarAlum(dni);

		if (index >= 0) {

			listaAlumno.get(index).setNombre(nombreNuevo);
		}
	}

	// Devuelve el alumno buscado si lo encuentra o null si no es así
	public Alumno buscarAlum2(String dni) {
		Alumno tem = null;
		boolean salir = false;

		for (int i = 0; i < listaAlumno.size() && !salir; i++) {
			if (listaAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = listaAlumno.get(i);
				salir = true;
			}
		}
		return tem;
	}

	// Imprimir usando for each

	public void imprimirLista() {
		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno);
		}
	}

	public void borrarAlumno(String dni) {
		int index = buscarAlum(dni);

		if (index >= 0) {
			listaAlumno.remove(index);
		}
	}

	// Este método estaría en la clase vista
	public void mostrarErrorAgregar(boolean b) {
		if (b) {
			System.out.println("Se ha agregado el alumno correctamente");
		} else {
			System.out.println("Error al insertar");
		}

	}
}