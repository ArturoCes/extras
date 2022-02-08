package ejercicio9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases.
		Crear un programa que simule una máquina vendedora de tickets de metro. Tendremos que
		crear la clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con
		funcionalidad) y la clase principal o de prueba. tendrá un menú donde se pueda:
		• Comprar uno o varios billetes.
		• Calcular el cambio a devolver.
		• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el
		ticket el mensaje “válido para x personas”.
		• Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener
		disponible un método que le ofrezca el saldo total de la recaudación de la máquina en
		ese día (no es necesario usar fechas) y pueda poner a cero el contador de saldo total.
		Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de los
		billetes ya que estos suelen subir todos los años.
		Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de
		cualquier otra cosa.
		Estas últimas funcionalidades también se harán con métodos dentro de la clase Maquina*/
		int opcion=0;
		int precioTicket=10;
		int numeroTicket=1;
		int miBillete=0;
		int precioNuevo=0;
		Ticket ticket = new Ticket(numeroTicket,precioTicket);
		Maquina maquina = new Maquina();
		System.out.println("Bienvenido");
		do {
		System.out.println("(1)Para comprar billete");
		System.out.println("(2)Ver la recaudacion total");
		System.out.println("(3)Cambiar el precio del billete");
		System.out.println("(0)Para salir");
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1:
			System.out.println(ticket.getPrecioTicket());
			break;
		case 2:
			break;
		case 3:
			System.out.println("Ingrese el nuevo precio");
			precioNuevo=Leer.datoInt();
			maquina.cambiarPrecioTicket(ticket,precioNuevo);
			break;
		case 0:
			break;
		default:
			break;
		}
		}while (opcion!=0);
	}

}
