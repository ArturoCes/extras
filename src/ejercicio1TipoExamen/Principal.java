package ejercicio1TipoExamen;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que tenga
			caché. Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación estándar, dos
			hijas llamadas Suite y Apartamento. Una clase más de gestión del hotel, que se puede llamar
			GestionHabitaciones y una clase principal de prueba para probar todos los métodos.
			Los atributos de una habitación estándar serán: precio base, si está ocupada o no, nombre del cliente,
			número de días de ocupación y número de ocupantes.
			En la clase Suite tenemos también la característica de metros cuadrados y la cantidad de dinero
			consumido en servicio de habitaciones. En estas habitaciones (y solo en estas por ser las más caras), el
			hotel tiene como detalle, hacer un descuento al precio base de la habitación.
			En los apartamentos, no está incluido el servicio de limpieza, pero se puede contratar por lo que será un
			atributo extra.
			Usaremos un método rescrito para calcular el precio de cualquier habitación.
			Para una habitación estándar la cantidad a pagar es el precio base por el número de días.
			Para los otros tipos:
			✓ Suites: hay que sumarle la cantidad según lo consumido en el servicio de habitaciones y
			descontarle el porcentaje que se pase como parámetro para el descuento.
			✓ Apartamentos: Hay que sumarle el extra por el servicio de limpieza.
			En la clase gestión, se debe crear un array de habitaciones donde guardaremos una habitación de cada
			tipo, incluyendo una estándar y podremos hacer lo siguiente:
			* Calcular el precio a pagar por una habitación de la lista elegida por el usuario.
			* Calcular lo recaudado en total entre todas las habitaciones ocupadas.
			* Mostrar factura con toda la información.
			* Mostrar listado solo de las habitaciones que no están ocupadas.
			* 
			*/
		int tam = 4, op=0,posicion=0,contador=0;
		int porcentaje = 20;
		double precio=25.0;
		HabitacionEstandar h [] = new HabitacionEstandar [tam];
		GestionHabitaciones g= new GestionHabitaciones(h);
		
	
		g.getH()[0]= new Suite (200, true, "Arturo Céspedes Pedrazas", 1, 2, 34.4, 200.25);
		contador++;
		g.getH()[1]= new HabitacionEstandar(100, true, "M", 1, 2);
		contador++;
		g.getH()[2]= new Apartamento(150, true, "Pedro", 3, 2, true);
		contador++;
		g.getH()[3]= new Apartamento(150, true, "Peyron", 3, 2, false);
		contador++;
		
		System.out.println("Hola, bienvenido");
		
		System.out.println("¿Que operación desea realizar?");
		do {
		System.out.println("1)Calcular precio de una habitación específica");
		System.out.println("2)Calcular el total recaudado entre todas las habitaciones ocupadas");
		System.out.println("3)Mostrar listado de todas las habitaciones que no esten ocupadas");
		System.out.println(g.recaudacionTotal(contador,porcentaje, precio));
		op=Leer.datoInt();
		
		switch (op) {
		case 1:
			
			g.mostrarHabitaciones();
			System.out.println("Seleccione la habitación de la cual quiere calcular el precio");
			posicion=Leer.datoInt();
			if(h.length>posicion) {	
			System.out.println(h[posicion-1].calcularPrecio(porcentaje, precio));
			}else {
				System.out.println("Lo siento,la habitación seleccionada no existe");
			}
			break;
		case 2:
			break;
		case 0:
			break;
		default:
			break;
		}
		}while(op!=0);
		
		
	}

}
