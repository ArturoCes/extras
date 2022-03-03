package ejercicio1Colecciones;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;
import temaColecciones.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0, favorito = 0;
		int id = 0;
		String titulo;
		String cuerpo;

		List<Notas> listaNotas = new ArrayList<Notas>();
		VisualStudioCode visual = new VisualStudioCode(1, listaNotas);
		System.out.println("Bienvenido a Visual Studio Code");

		System.out.println("Seleccione la opción que desea realizar");
		do {
			System.out.println("1)Agregar nueva nota");
			System.out.println("2)Eliminar nota");
			System.out.println("3)Mostrar nota individual");
			System.out.println("4)Mostrar tamaño");
			System.out.println("0)Salir");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				id++;
				System.out.print("Ingrese el título de la nota: ");
				titulo = Leer.dato();
				System.out.print("Ingrese el contenido de la nota: ");
				cuerpo = Leer.dato();
				System.out.println("¿Agregar esta nota a favoritos?");
				System.out.print("Si=1/ No= Cualquier otro número: ");
				favorito = Leer.datoInt();
				if (favorito == 1) {
					Notas a = new Notas(id, titulo, cuerpo, true);
					visual.agregarNota(a);
				} else {
					Notas a = new Notas(id, titulo, cuerpo, false);
					visual.agregarNota(a);
				}
				break;
			case 2:
				visual.mostrarNota();
				System.out.println("Indica el id de la nota que quieres eliminar");
				id=Leer.datoInt();
				visual.getListaNotas().remove(id-1);
				System.out.println("Nota eliminada correctamente");
				break;
			case 3:
				System.out.println(visual.getListaNotas());
				break;
			case 4:
				
				visual.mostrarTamanyo();
	
				break;
			case 0:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Selecciona una opción permitida");
				break;
			}
		} while (op != 0);
		
	}

}
