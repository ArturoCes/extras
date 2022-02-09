package ejercicioP;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 0, opcion = 0, contenido = 0;
		double altura = 0.0, radio = 0.0, precioBase = 0.0, porcentaje = 0.0, precioLitro = 0.70, capacidadActual = 0.0;
		int posicion = 0,cpMaxima=0;// Si se quisiera usar el deposito creado a mano, poner la variable posicion en 1.
//		Deposito deposito1 = new Deposito(12, 2, 100, 210);
		Deposito deposito[];

		System.out.println("Bienvenidos");
		System.out.println("Cuantos depositos quiere gestionar");
		tam = Leer.datoInt();
		deposito = new Deposito[tam];
		System.out.println("Ingresa la capacidad máxima de litros admitidos en esta plataforma");
		cpMaxima=Leer.datoInt();
		GestionPlataforma.setCapacidadMaxima(cpMaxima);
		GestionPlataforma g = new GestionPlataforma(deposito);
//		deposito[0] = deposito1;

		
		do {
			g.imprimirMenuPpal();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				if ((posicion < deposito.length) && GestionPlataforma.getCapacidadMaxima()>capacidadActual) {
					System.out.println("Ingrese la altura del deposito");
					altura = Leer.datoDouble();
					System.out.println("Ingrese el radio del depósito");
					radio = Leer.datoDouble();
					System.out.println("Ingrese el contenido actual sin decimales del deposito");
					contenido = Leer.datoInt();
					System.out.println("Ingrese el precio base del depósito");
					precioBase = Leer.datoDouble();
					Deposito d = new Deposito(altura, radio, contenido, precioBase);
					
					if (deposito.length > 0) {
						for (int i = 0; i < posicion; i++) {
							capacidadActual = capacidadActual + deposito[i].calcularVolumen();
						}
					}
					if (d.calcularVolumen() + capacidadActual < GestionPlataforma.getCapacidadMaxima()) {
						g.añadirDeposito(altura, radio, contenido, posicion, precioBase);
						posicion++;
						capacidadActual=0;
					}else {
						System.out.println("Alerta! Capacidad máxima excedida");
					}
				} else {
					System.out.println("Lo siento plataforma llena");
				}
				break;
			case 2:
				for (int i = 0; i < deposito.length; i++) {
					System.out.println(i + 1 + ".-" + " " + deposito[i]);
				}
				System.out.println("Seleccione el depósito que desea");
				posicion = Leer.datoInt();
				System.out.println("Ingrese el porcentaje de ganancia que desea para este depósito");
				porcentaje = Leer.datoDouble();
				System.out.println("Su ganancia sera de " + g.calcularGanancia(posicion, porcentaje) + "Euros");
				System.out.printf("El precio final es de: %.2f",g.calcularPrecioFinal(posicion,porcentaje));
				break;
			case 3:
				for (int i = 0; i < deposito.length; i++) {
					System.out.println(i + 1 + ".-" + " " + deposito[i]);
				}
				System.out.println("Seleccione el depósito que desea");
				posicion = Leer.datoInt();
				System.out.printf("La ganancia de Repsol sera de : %.2f",
						g.calcularGananciaRepsol(posicion, precioLitro), "Euros");

				break;
			case 4:
				for (int i = 0; i < deposito.length; i++) {
					System.out.println(i + 1 + ".-" + " " + deposito[i]);
				}
				System.out.println("Seleccione el depósito del cual quiere calcular el volumen");
				posicion = Leer.datoInt();
				System.out.printf("El volumen del depósito es : %.2f", deposito[posicion - 1].calcularVolumen());
				break;
			case 5:
				for (int i = 0; i < deposito.length; i++) {
					System.out.println(i + 1 + ".-" + " " + deposito[i]);
				}
				break;
			default:
				System.out.println("Error,especifica una opción establecida");
				break;
			}
		} while (opcion != 0);
	}

}
