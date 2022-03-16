package ejercicio06COLECCIONES;

import java.util.Comparator;

public class OrdenarPorSueldo implements Comparator <Trabajador>{

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		if(o1.getSueldoFinal()<o2.getSueldoFinal()) {
			return -1;
		}else {
			if(o1.getSueldoFinal()>o2.getSueldoFinal()) {
				return 1;
			}
			return 0;
		}
	}
	
	
}
