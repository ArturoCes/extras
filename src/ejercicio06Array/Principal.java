package ejercicio06Array;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int fila=1, asiento=1, idAsiento=1, idSala=1, opcion=0;
		double precioEntrada;
		
		Entrada entrada;
		Sala sala= new Sala(idSala);
		idSala++;
	
		for(int i=0;i<sala.getAsientos().length;i++) {
			for(int j=0;j<sala.getAsientos()[i].length;j++) {
				sala.getAsientos()[i][j]=new Entrada(idAsiento, j, i);
				idAsiento++;
			}
		}
		for(int i=0;i<sala.getAsientos().length;i++) {
			for(int j=0;j<sala.getAsientos()[i].length;j++) {
				
			}
		}
			System.out.println("Bienvenidos a CINEMA");
			System.out.println("¿Qué desea hacer?");
		do {
			System.out.println("1)Para comprar entrada");
			System.out.println("2)Ver ganancias totales del dia");
			System.out.println("3)Ver y cambiar coste de la entrada");
			System.out.println("4)Mostrar cartelera");
			System.out.println("0)Salir");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la fila que desea");
				fila=Leer.datoInt();
				System.out.println("Ingrese el número de asiento");
				asiento=Leer.datoInt();
				if(sala.getAsientos()[asiento][fila].isdisponible()) {
					System.out.println("El coste de la entrada es: "+sala.getAsientos()[asiento][fila].getPrecio()+" $");
					System.out.println("El asiento numero "+sala.getAsientos()[asiento][fila].getId()+" ha sido comprado exitosamente");
					sala.getAsientos()[asiento][fila].setdisponible(false);
					sala.setDineroRecaudado(sala.getDineroRecaudado()+sala.getAsientos()[asiento][fila].getPrecio());
				}else {
					System.out.println("Lo siento, este asiento ya se encuentra ocupado");
				}
				break;
			case 2: 
				System.out.println("Las ganancias totales del dia son: "+sala.getDineroRecaudado()+"$");
				break;
			case 3: 
				System.out.println("El coste actual de la entrada es: "+sala.getAsientos()[asiento][fila].getPrecio()+"$");
				System.out.println("Ingrese el nuevo precio de la entrada");
				precioEntrada=Leer.datoDouble();
				sala.getAsientos()[asiento][fila].setPrecio(precioEntrada);
				System.out.println("El nuevo coste de la entrada es de: "+sala.getAsientos()[asiento][fila].getPrecio()+"$");
				break;
			case 4:
				sala.mostrarCartelera();
				break;
			}
		}while(opcion!=0);
	}

}
