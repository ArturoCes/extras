package ejercicio02Array;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion listado[] ={new  Habitacion(1,50.0,false,"Miguel",2,true,true),new  Habitacion(2,50.0,false,"Carlos",3,true,true)};
		Hotel h;
		int numH;
		
		System.out.println("Bienvenido al hotel");
		h=new Hotel (listado);
		//Imprimimos la lista entera
		h.imprimirListado();
		//Decidimos que habiltacion consultar	
		System.out.println("¿Qué habitación quiere consultar?");
		numH=Leer.datoInt();
		h.imprimirLimpia(numH);
		
		
		
		
	}

}