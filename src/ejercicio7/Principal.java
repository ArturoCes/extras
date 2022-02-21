
package ejercicio7;

import lectura.Leer;

public class Principal {
	
	public static void main (String [] args) {
		
		Cuenta cuenta;
		Oficina oficina;
		double saldo,cant;
		String nombreTitular;
		boolean op;
		
		
		System.out.println("Hola");
		System.out.println("Diga saldo");
		saldo=Leer.datoDouble();
		System.out.println("Diga el nombre del titular");
		nombreTitular=Leer.dato();
		
		cuenta=new Cuenta (saldo,nombreTitular);
		//Creamos la oficina
		oficina=new Oficina (cuenta,1);
		//1.Ingresar
		System.out.println("Diga dinero a ingresar");
		oficina.ingresar(Leer.datoDouble());
		
		/*/Con variable sería 
		cant=Leer.datoDouble();
		o.ingresar(cant);*/
		//2.Retirar opción A
		//Guardando el booleando que devuelve retirar en variable
		//y esta se le pasa a imprimirMensaje 
		System.out.println("Diga dinero a retirar");
		cant=Leer.datoDouble();
		op=oficina.retirar(cant);
		oficina.imprimirMensaje(op);
		/*
		//2.Retirar opción B
		System.out.println("Diga dinero a retirar");
		cant=Leer.datoDouble();
		o.imprimirMensaje(o.retirar(cant));*/
		
		
		
		System.out.println("El saldo de la cuenta es: "+cuenta.getSaldo());
	}	
}
