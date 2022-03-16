package ejercicio05COLECCIONES;

import java.util.Comparator;

public class CompararNombre implements Comparator<Persona>{
	
	public int compare(Persona p1,Persona p2) {
		return (p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase()));
	}
}
