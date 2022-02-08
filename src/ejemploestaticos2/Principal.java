package ejemploestaticos2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0;
		int seguir, nVs=0;
		String modelo;
		Vehiculo [] lista;
		System.out.println("Introduce el tamaño de la lista");
		tam=Leer.datoInt();
		lista =new Vehiculo [tam];
		do {
			System.out.print("Introduce el modelo del vehículo: ");
			modelo = Leer.dato();
			System.out.print("Introduce la potencia: ");
			double potencia=Leer.datoDouble();
			lista[nVs]=new Vehiculo (modelo, potencia);
			nVs++;//Aumentamos en uno el número de vehículos
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir=Leer.datoInt();
			} while(seguir !=0 && nVs<lista.length);
		//Imprimimos los vehículos introducidos, ojo no hasta el tamaño del array, sino hasta donde hay
		//vehículos con datos
			for (int i=0; i<nVs; i++){
				System.out.println (lista[i]);
			}
			System.out.println("Fin del programa");
		}
		}
		
	

	