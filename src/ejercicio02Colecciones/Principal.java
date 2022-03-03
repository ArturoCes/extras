package ejercicio02Colecciones;

import java.util.ArrayList;
import java.util.List;

import ejercicio1Colecciones.Notas;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, apellidos, dni, email;
		String busquedaLeida;
		int edad = 0, edadMinima = 18, indice = 0, delete = 0;
		List<Socio> listaSocios = new ArrayList<Socio>();
		GestionClub g = new GestionClub(1, listaSocios, "Camino de Coria");
		int op = 0;

		System.out.println(" /$$$$$$$$ /$$   /$$ /$$$$$$$$        /$$$$$$  /$$       /$$   /$$ /$$$$$$$ \r\n"
				+ "|__  $$__/| $$  | $$| $$_____/       /$$__  $$| $$      | $$  | $$| $$__  $$\r\n"
				+ "   | $$   | $$  | $$| $$            | $$  \\__/| $$      | $$  | $$| $$  \\ $$\r\n"
				+ "   | $$   | $$$$$$$$| $$$$$         | $$      | $$      | $$  | $$| $$$$$$$ \r\n"
				+ "   | $$   | $$__  $$| $$__/         | $$      | $$      | $$  | $$| $$__  $$\r\n"
				+ "   | $$   | $$  | $$| $$            | $$    $$| $$      | $$  | $$| $$  \\ $$\r\n"
				+ "   | $$   | $$  | $$| $$$$$$$$      |  $$$$$$/| $$$$$$$$|  $$$$$$/| $$$$$$$/\r\n"
				+ "   |__/   |__/  |__/|________/       \\______/ |________/ \\______/ |_______/ \r\n"
				+ "                                                                            \r\n"
				+ "                                                                            \r\n"
				+ "                                                                            ");

		System.out.println("Bienvenido a THE CLUB");
		System.out.println("Seleccione la opción que desea realizar");

		do {
			System.out.println("1)Añadir nuevo socio");
			System.out.println("2)Eliminar un socio");
			System.out.println("3)Buscar y modificar datos de  un socio");
			System.out.println("0)Salir");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca el nombre del nuevo socio");
				nombre = Leer.dato();
				System.out.println("Introduzca los apellidos del nuevo socio");
				apellidos = Leer.dato();
				System.out.println("Introduzca el email del nuevo socio");
				email = Leer.dato();
				System.out.println("Introduzca la edad del nuevo socio");
				edad = Leer.datoInt();
				System.out.println("Introduzca el dni del nuevo socio");
				dni = Leer.dato();
				Socio socio = new Socio(nombre, apellidos, email, edad, dni);
				if (edad >= edadMinima) {
					g.agregarSocio(socio);
					System.out.println("Socio añadido correctamente :D");
					indice++;
					delete++;
				} else {
					System.out.println("Lo siento no tienes la edad suficiente para ser socio");
				}
				break;
			case 2:
				g.mostrarSocios(indice);
				System.out.println("Indica el id del socio que quieres eliminar");
				delete = Leer.datoInt();
				if (delete!=0) {
				g.eliminarSocio(g.buscarSocio(delete));
				System.out.println("Socio eliminado correctamente");
				}else {
					System.out.println("Ingrese un id válido");
				}
				break;
			case 3:
				System.out.println("Ingrese el DNI del socio que desea buscar");
				busquedaLeida = Leer.dato();
				boolean encontrado = false;
				for (int i = 0; i < listaSocios.size(); i++) {
					if (g.buscarSoloUnSocio(i).getDni().equalsIgnoreCase(busquedaLeida)) {
						encontrado = true;
						System.out.println("El cliente existe");
						g.mostrarUnSocio(i);
						System.out.println("Ingrese el nuevo nombre");
						nombre=Leer.dato();
						g.buscarSoloUnSocio(i).setNombre(nombre);
	
					} else {
						System.out.println("El cliente NO existe");
					}
				}
				//TODO ESTO EN UN MÉTODO MODIFICARLO :)
				break;
			case 0:
				System.out.println("Saliendo...");
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Ingrese una opción correcta");
				break;

			}
		} while (op != 0);

	}

}
