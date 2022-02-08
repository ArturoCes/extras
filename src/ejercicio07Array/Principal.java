package ejercicio07Array;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion =0;
		Monedero m = new Monedero (0);
		double dineroIngresado=0.0;
		do {
		System.out.println("Bienvenido");
		System.out.println("Ingrese el dinero base del nuevo monedero");
		dineroIngresado=Leer.datoDouble();
		m.crearMonedero(m.getDinero(), dineroIngresado);
		m.setDinero(dineroIngresado);
		}while(dineroIngresado<=0);
		do {
		System.out.println("Seleccione la opción que desea");
		System.out.println("1)Ingresar dinero");
		System.out.println("2)Para ver el saldo actual del monedero");
		System.out.println("3)Retirar dinero");
		opcion=Leer.datoInt();
		switch (opcion) {
		case 1:
			System.out.println("Introduzca la cantidad de dinero que desea ingresar");
			dineroIngresado=Leer.datoDouble();
			m.ingresarDinero(m.getDinero(), dineroIngresado);
			break;
		case 2:
			System.out.println("El saldo es "+ m.getDinero());
			break;
		case 3:
			System.out.println("¿Cuanto dinero desea retirar?");
			dineroIngresado=Leer.datoDouble();
			if(m.getDinero()>=dineroIngresado) {
				m.retirarDinero(m.getDinero(), dineroIngresado);
				System.out.println("Transacción realizada con exito");
			}else {
				System.out.println("No tienes dinero suficiente");
			}
			break;
		default:
			break;
		}
		}while(opcion!=0);
		
		
	}

}
