package ejercicioHerencia3;

import utilidades.Leer;

public class Principal {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,tam=10,posicion=0;
		double cilindrada,caballos,potencia,impuesto;
		String tipoCombustible="";
		Vehiculo vehiculo [] =new Vehiculo [tam];
		
		Motocicleta m=new Motocicleta(100, 90, "gasolina 85", 100);
		Coche c= new Coche(100, 1000, "Diesel");
		Furgoneta f= new Furgoneta(150, 200, "Diesel", 1000);
		Gestion g = new Gestion(vehiculo);
		Vehiculo furgo;
		Vehiculo moto;
		Vehiculo coche;
	
		System.out.println("Bienvenidos");
		do {
		System.out.println("\nSeleccione el vehiculo del cual quiere calcular el impuesto");
		System.out.println("1)Motocicleta");
		System.out.println("2)Coche");
		System.out.println("3)Furgoneta");
		System.out.println("4)Añadir nuevo vehículo");
		System.out.println("5)Ver la lista de vehículo");
		System.out.println("0)Salir");
		
		opcion=Leer.datoInt();
		switch (opcion) {
		case 1:
			System.out.println("El precio por impuesto de su motocicleta es de " +m.calcularImpuestos());
			break;
		case 2:
			System.out.println("El precio por impuesto de su coche es de "+c.calcularImpuestos());
			break;
		case 3:
			System.out.println("El precio por impuesto de su furgoneta es de "+f.calcularImpuestos());
			break;
		case 4:
			do {
			System.out.println("1)Coche");
			System.out.println("2)Motocicleta");
			System.out.println("3)Furgoneta");
			System.out.println("4)Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Indique la cilindrada del coche");
				cilindrada=Leer.datoDouble();
				System.out.println("Indique los caballos de fuerza del coche");
				caballos=Leer.datoDouble();
				System.out.println("Indique cual es el tipo de combustible que tiene");
				tipoCombustible=Leer.dato();
				coche=new Coche(cilindrada, caballos, tipoCombustible);
				g.añadirVehiculo(coche,posicion);
				posicion++;
				break;
			case 2:
				System.out.println("Indique la cilindrada de la motocicleta");
				cilindrada=Leer.datoDouble();
				System.out.println("Indique los caballos de fuerza de la  motocicleta");
				caballos=Leer.datoDouble();
				System.out.println("Indique cual es el tipo de combustible que tiene");
				tipoCombustible=Leer.dato();
				System.out.println("Indique la potencia de la motocicleta");
				potencia=Leer.datoDouble();
				moto=new Motocicleta (cilindrada, caballos, tipoCombustible, potencia);
				g.añadirVehiculo(moto,posicion);
				posicion++;
			
				break;
			case 3:
				System.out.println("Indique la cilindrada de la furgoneta");
				cilindrada=Leer.datoDouble();
				System.out.println("Indique los caballos de fuerza de la furgoneta");
				caballos=Leer.datoDouble();
				System.out.println("Indique cual es el tipo de combustible que tiene");
				tipoCombustible=Leer.dato();
				impuesto=1000;
				furgo=new Furgoneta (cilindrada, caballos, tipoCombustible, impuesto);
				g.añadirVehiculo(furgo,posicion);
				posicion++;
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Error");
				break;
			}
			}while(opcion!=4);
			break;
		case 5:
			System.out.println(g);
			break;
		default:
			System.out.println("Error,caracter no reconocido");
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		}
		}while (opcion!=0);
		System.out.println("Adíos");
		
		
		
		
	}

}
