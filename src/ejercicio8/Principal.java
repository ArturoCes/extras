package ejercicio8;

import lectura.Leer;

public class Principal {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	Sorteo sorteo=new Sorteo();
	int opcion=0;
	int cifras=0,billete=0;
	
	System.out.println("Bienvenido a la loteria");
	do {
	System.out.println("Presiona 1 para comprar un billete");
	System.out.println("Presiona 2 para verificar un billete");
	System.out.println("Presiona 3 para salir");
	opcion=Leer.datoInt();
		switch (opcion) {
			case 1:
				System.out.println("Presiona 1 para generar billete aleatoriamente");
				System.out.println("Presiona 2 para ingresar los números de forma manual");
				opcion=Leer.datoInt();
				switch (opcion) {
				case 1:
					sorteo.setBillete(sorteo.generarDecimo());
					System.out.println("Su billete es:"+sorteo.getBillete());
					break;
				case 2:
					System.out.println("Ingrese un n�mero de 9 d�gitos");
					billete=Leer.datoInt();
					int numero=billete;
					while(numero!=0){            
	                    numero = numero/10;        
	                    cifras++;    
	              }
					if(cifras==9) {
						sorteo.setBillete(billete);
					System.out.println("Su boleto es:"+sorteo.getBillete());
					}else {
						System.out.println("Recuerde que deben ser 9 números");
					}
					break;
				default:
					System.out.println(";C");
					break;
			
			}
			
				break;
			case 2:
				mostrarGanador(sorteo.getBillete());
				
				break;
			case 3:
			System.out.println("Hasta luego.");
				break;	
			default:
			break;
		}	
		cifras=0;
	}while (opcion!=3);
	}
	public static void mostrarGanador (int billete) {
		Sorteo sorteito = new Sorteo (billete);
		if(billete>0) {
			int res=sorteito.comprobarGanador(billete);
			if (res==0) {
				System.out.println("Ganaste! "+billete);
			}else {
				System.out.println("Lo siento, el billete ganador fue "+res);
			}
			
		}else {
			System.out.println("Usted no ha adquirido ning�n billete");
		}
	}
}
