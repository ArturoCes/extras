package ejercicio06Array;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Ap√©ndice de m√©todo generado autom√°ticamente
		
		int fila=1, butaca=1, idAsiento=1, idSala=1, opcion=0;
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
			System.out.println("øQuÈ desea hacer?");
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
				System.out.println("Ingrese el n˙mero de butaca");
				butaca=Leer.datoInt();
				if(sala.getAsientos()[butaca][fila].isdisponible()) {
					System.out.println("El coste de la entrada es: "+sala.getAsientos()[butaca][fila].getPrecio()+" $");
					System.out.println("El asiento numero "+sala.getAsientos()[butaca][fila].getId()+" ha sido comprado exitosamente");
					sala.getAsientos()[butaca][fila].setdisponible(false);
					sala.setDineroRecaudado(sala.getDineroRecaudado()+sala.getAsientos()[butaca][fila].getPrecio());
				}else {
					System.out.println("Lo siento, este asiento ya se encuentra ocupado");
				}
				break;
			case 2: 
				System.out.println("Las ganancias totales del dia son: "+sala.getDineroRecaudado()+"$");
				break;
			case 3: 
				System.out.println("Ingrese su n˙mero de fila");
				fila=Leer.datoInt();
				System.out.println("Ingrese el n˙mero de butaca");
				butaca=Leer.datoInt();
				System.out.println("El coste actual de la entrada es: "+sala.getAsientos()[butaca][fila].getPrecio()+"$");
				System.out.println("Ingrese el nuevo precio de la entrada");
				precioEntrada=Leer.datoDouble();
				sala.getAsientos()[butaca][fila].setPrecio(precioEntrada);
				System.out.println("El nuevo coste de la entrada es de: "+sala.getAsientos()[butaca][fila].getPrecio()+"$");
				break;
			case 4:
				sala.mostrarCartelera();
				break;
			}
		}while(opcion!=0);
	}

}
