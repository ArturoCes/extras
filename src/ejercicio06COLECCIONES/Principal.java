package ejercicio06COLECCIONES;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		Crear una clase Trabajador con los siguientes atributos:
//			Nombre, DNI, Horas trabajadas y sueldo final (este se puede calcular de cualquier manera sencilla de las que
//			hemos visto anteriormente).
	//		Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados según el número de horas
	//		trabajadas o según el sueldo (del que menos al que más cobra). Se deben usar comparable o comparator.
//		
		List <Trabajador>lista = new ArrayList<Trabajador> ();
		String direccion = null;
		Empresa empresa = new Empresa(lista, direccion);
		int opcion= 0;
		empresa.getLista().add(new Trabajador("eo", "21912", 101, 250.0));
		empresa.getLista().add(new Trabajador("eo1", "219123", 120, 210.0));
		empresa.getLista().add(new Trabajador("eo2", "219124", 103, 200.0));
		
		System.out.println("Bienvenido");
		System.out.println("Indique la opción que desea realizar");
		
		do {
			
			System.out.println("1)Para añadir nuevo trabajador");
			System.out.println("2)Para eliminar un trabajador");
			System.out.println("3)Para buscar un trabajador");
			System.out.println("4)Para ordenar trabajadores según el número de horas trabajadas");
			System.out.println("5)Para ordenar trabajadores según el sueldo que tengan (de menor a mayor)");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				Collections.sort(empresa.getLista());
				empresa.mostrarLista();
				break;
			case 5:
				Collections.sort(empresa.getLista(),new OrdenarPorSueldo());	
				empresa.mostrarLista();
				break;
			case 6:
				break;
			case 0:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Error,indique un número válido");
				break;
			}
		} while (opcion!=0);
	}

}
