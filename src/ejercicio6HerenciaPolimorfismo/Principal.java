package ejercicio6HerenciaPolimorfismo;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 3,op=0,posicion=0,contarEmpresa=0;
		int numerador=0;
		double ingreso, retiro,retirar,total = 0;
		
		Cuenta c [] = new Cuenta [tam];
		Oficina o = new Oficina (c);
		Cuenta cu = new CuentaCorriente(200, "Nacho", 10);
		Cuenta ce = new CuentaJoven(200, "Arturo", 1);
		Cuenta ca= new CuentaEmpresa(200, "Nem", 1);
		
		c[posicion++]=ce;
		c[posicion++]=cu;
		c[posicion++]=ca;
		
		
		System.out.println("Bienvenido al banco");
		System.out.println("¿Qué operación desea realizar?");
		do {
		System.out.println("1)Ingresar dinero");
		System.out.println("2)Retirar dinero");
		System.out.println("3)Calcular ganancia de la oficina");
		System.out.println("4)Calcular ganancia de la oficina con el retiro de cuentas empresariales");
		op=Leer.datoInt();
		switch (op) {
		case 1:
			System.out.println("Seleccione su cuenta por el número identificador");
			numerador=0;
			
			for (int i = 0; i < c.length; i++) {
				numerador++;
				System.out.println(numerador+":"+ c[i]);
			}
			posicion=Leer.datoInt();	
			System.out.println("Ingrese la cantidad de dinero que desea ingresar");
			ingreso=Leer.datoDouble();
			c[posicion-1].ingresarDinero(ingreso);
			System.out.println(c[posicion-1]);
			break;
		case 2:
			System.out.println("Seleccione su cuenta por el número identificador");
			numerador=0;
			for (int i = 0; i < c.length; i++) {
				numerador++;
				System.out.println(numerador+":"+ c[i]);
			}
			
			posicion=Leer.datoInt();
			if(c[posicion-1]instanceof CuentaEmpresa) {
				contarEmpresa++;
			}
			System.out.println("Ingrese la cantidad de dinero que desea retirar");
			retirar=Leer.datoDouble();
			c[posicion-1].retirarDinero(retirar);
			System.out.println(c[posicion-1]);
			
			break;
		case 3:
			for (int i = 0; i < c.length; i++) {
				total=total+c[i].getSaldoCuenta();
			}
			System.out.println(total);
			break;
		case 4:
			System.out.println("El dinero recaudado es de :"+contarEmpresa);
			break;
		default:
			break;
		}
		
		
		}while (op!=0);
	}

}
