package ejercicio04Array;

import java.util.Iterator;

import ejercicio02Array.Habitacion;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura=0,peso=0;
		int opcion=0,clientesRegistrados=0,tam=10,id=0;
		String nombre="",apellidos ="",dni="";
		Cliente [] listaClientes= new Cliente [tam];
		Gimnasio g = new Gimnasio ();
		System.out.println("Bienvenido");
		do {
			
			System.out.println("1)Registrar");
			System.out.println("2)Darse de baja");
			System.out.println("3)Ver cliente");
			System.out.println("4)Calcular el IMC");
			System.out.println("0)Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			
			case 1:
				if(clientesRegistrados<listaClientes.length) {
					System.out.println("Ingrese su Dni");
					dni=Leer.dato();
					System.out.println("Ingrese su nombre");
					nombre=Leer.dato();
					System.out.println("Ingrese sus apellidos");
					apellidos=Leer.dato();
					System.out.println("Ingrese su peso");
					peso=Leer.datoDouble();
					System.out.println("Ingrese su estatura");
					altura=Leer.datoDouble();
					listaClientes[clientesRegistrados]= new Cliente (dni,nombre,apellidos,true,peso,altura);
					clientesRegistrados++;
					id++;
				}else {
					System.out.println("Lo siento, todos los espacios estan ocupados");
				}
				break;
			case 2 :
				System.out.println("Ingresa tu número de cliente");
				id=Leer.datoInt();
				listaClientes[id-1].setActividad(false);
				System.out.println("Haz sido dado de baja, vuelve pronto");
				break;
			default:
				break;
			case 3:
				System.out.println("Ingrese su número de cliente");
				id=Leer.datoInt();
				System.out.println(listaClientes[id-1]);
				break;
			case 4:
				if(id>=1) {
					System.out.println("Introduzca su número de cliente");
					id=Leer.datoInt();
					listaClientes[id-1].calcularIMC();
					listaClientes[id-1].imprimirIMC();	
				}else {
					System.out.println("No hay clientes registrados");
				}
				
				break;
			}
		} while (opcion!=0);
		
		Cliente c1 = new Cliente ();
		
	
	}

}
