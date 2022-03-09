package ejercicio3COLECCIONES;

import java.util.HashSet;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que guarde los nombres de los alumnos de la clase. Se
		 * deben poder mostrar, modificar y borrar los que se quiera de forma
		 * individual, es decir, el usuario debe decir quién quiere mostrar, modificar o
		 * borrar. Se puede crear otra clase con funcionalidades como sacar nota media
		 * del curso, dar el número de suspensos en total, media de suspensos, etc. Usa
		 * la interfaz Set implementada por hashset.
		 */
		int opcion = 0;
		String nombreNuevo;
		String nombre, apellidos;
		Double notaMedia;
		Set<Alumno> lista = new HashSet<Alumno>();
		GestionClase g = new GestionClase(lista, "1ºDAM");

		System.out.println("Bienvenido");
		System.out.println("Selecciona la operación que deseas realizar");

		do {
			System.out.println(" 1) Ingresar nuevo alumno.");
			System.out.println(" 2) Modificar nota media de un alumno.");
			System.out.println(" 3) Eliminar alumno.");
			System.out.println(" 4) Obtener nota media del curso.");
			System.out.println(" 5) Mostrar el número de suspensos en el curso.");
			System.out.println(" 6) Mostrar datos de un alumno.");
			System.out.println(" 0) Salir.");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el nombre del nuevo alumno");
				nombre = Leer.dato();

				System.out.println("Ingrese apellidos del nuevo alumno");
				apellidos = Leer.dato();

				System.out.println("Ingresa la nota media del nuevo alumno");
				notaMedia = Leer.datoDouble();

				Alumno a = new Alumno(nombre, apellidos, notaMedia);
				g.agregarAlumnoNuevo(a);
				break;
			case 2:
				System.out.println("Ingrese el nombre del alumno que busca");
				nombre=Leer.dato();
				System.out.println("Ingrese el nombre nuevo del alumno");
				nombreNuevo=Leer.dato();
				g.buscarAlumno(nombre,nombreNuevo);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Adíos");
				break;
			}
		} while (opcion != 0);
	}

}
