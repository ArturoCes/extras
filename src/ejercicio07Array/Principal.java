package ejercicio07Array;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monedero m = null ;
		int opcion=0;
		double dineroBase=0.0,dineroIngresado=0.0,dinero=0.0,dineroRetirado=0.0;
		do {
		System.out.println("1)Crear un monedero");
		System.out.println("2)Ingresar dinero");
		System.out.println("3)Ver saldo del monedero");
		System.out.println("4)Retirar dinero");
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Ingresar dinero base del monedero");
			dineroBase=Leer.datoDouble();
			m=new Monedero(dineroBase);
			System.out.println("Monedero creado con exito, saldo: "+m.getDinero());
			break;
		case 2:
			if(dineroBase>1) {
			System.out.println("Introduzca la cantidad de dinero que desea ingresar");
			dineroIngresado=Leer.datoDouble();
			dinero=m.getDinero()+dineroIngresado;
			m.setDinero(dinero);
			System.out.println("El nuevo saldo es de "+m.getDinero());
			}else {
				System.out.println("No haz creado aún ningun monedero");
			}
			break;
		case 3:
			if(dineroBase>1) {
			System.out.println("El saldo es de "+m.getDinero());
			}else {
				System.out.println("Lo siento aún no haz creado ningun monedero");
			}
			break;
		case 4:
			System.out.println("Cuanto dinero desea retirar");
			dineroRetirado=Leer.datoDouble();
			if(dinero>=dineroRetirado) {
			
			dinero=m.getDinero()-dineroRetirado;
			m.setDinero(dinero);
			System.out.println("Dinero retirado con exito");
		}else {
			System.out.println("Dinero insuficiente");
		}
			break;
		default:
			break;
		}
		}while(opcion!=0);
	}
	

}
