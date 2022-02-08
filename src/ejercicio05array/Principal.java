package ejercicio05array;

import lectura.Leer;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int opcion=0,tam=0,consumo=0;

	
	Electrodomestico listaE [];
	char consumoElectrico []= {'A','B','C','D','F'};
	char consumoElectricoleido ='F';
	String colorleido="",electrodomesticoLeido = "";
	Tienda t1 = new Tienda();
	double precioBase;
	String colorE;
 	char letraConsumo;
	 double peso;
	 int pos=0,numE=0,contador=0;
	String color []= {"Azul","Blanco","Negro","Naranja","Marron"};
	Electrodomestico electrodomestico;
	
	System.out.println("Bienvenidos");
	System.out.println("Introduzca el número de productos que introducira");
	tam=Leer.datoInt();
	listaE= new Electrodomestico [tam];
	do {
	System.out.println("1) Para introducir nuevo electrodomestico basico");
	System.out.println("2) Para introducir nuevo electrodomestico completo");
	System.out.println("3)Para ver el precio de un electrodomestico");
	System.out.println("4)Para ver el precio total de todos los electrodomesticos");
	System.out.println("5)Para ver la media de precio de todos los electrodomesticos");
	opcion=Leer.datoInt();
	
	switch (opcion) {
	case 1:
		System.out.println("Ingrese el precio base del producto");
		precioBase=Leer.datoDouble();
		System.out.println("Ingrese el peso del producto");
		peso=Leer.datoDouble();
		electrodomestico = new Electrodomestico(precioBase,peso);
		listaE[pos]=electrodomestico;
		pos++;
		contador++;
		t1.setElectrodomestico(listaE);
		break;
	case 2:
		System.out.println("Ingrese el precio base del producto");
		precioBase=Leer.datoDouble();
		System.out.println("Introduzca el color ");
		colorE=Leer.dato();
		System.out.println("Ingrese el consumo electrico del producto (A a la F)");
		letraConsumo=Leer.datoChar();
		System.out.println("Ingrese el peso del producto");
		peso=Leer.datoDouble();
		electrodomestico = new Electrodomestico(precioBase,colorE,letraConsumo,peso);
		listaE[pos]=electrodomestico;
		pos++;
		contador++;
		t1.setElectrodomestico(listaE);
		break;
	}
	}while(contador<tam);
	
	do {
		System.out.println("1)Para ver el precio de un producto especifico");
		System.out.println("2)Para ver el precio total de todos los electrodomesticos");
		System.out.println("3)Para ver la media de precio de todos los electrodomesticos");
		opcion=Leer.datoInt();
	switch (opcion) {
	case 1:
		
		System.out.println("Introduzca el número del electrodomestico");
		numE=Leer.datoInt();
		if(pos==0) {
			System.out.println("No haz introducido ningun electrodomestico");
		}else {
			System.out.println(t1.comprobarPrecioFinal(numE-1));
			
		}
		break;
	case 2:
		System.out.println("El precio total es de : "+t1.sumaFinal());
		break;
	case 3:
		System.out.println("La media de precio de los productos es"+t1.calcularMediaPrecioFinal());
		break;
	default:
		break;
	
	}
	}while(opcion!=0);
	}
}


