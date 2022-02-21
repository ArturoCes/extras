package ejercicio02TipoExamen;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 3, op = 0, posicion;
		double dinero = 0.0, ganancia = 0.0,fijo=100;
		Producto[] lista = new Producto[tam];
		lista[0] = new Moviles(100, 2, "Movil", false, "Samsung", "Galaxy One");
		lista[1] = new EspadaLaser(200, 2, "Leader", false, "Double");
		lista[2] = new EspadaLaser(200, 2, "Leader", false, "Simple");
		Ventas v = new Ventas(lista);

		System.out.println("Bienvenido");
		System.out.println("Seleccione la operaci�n que desea realizar");
		do {
			System.out.println("0)Para salir");
			System.out.println("1)Mostrar lista de productos sin vender");
			System.out.println("2)Mostrar el dinero total recaudado con todas las ventas");
			System.out.println("3)Mostrar lista de productos");
			System.out.println("4)Vender producto");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				v.productosSinVender();
				break;
			case 2:
				System.out.println(v.getCantidadTotal());
				break;
			case 3:

				v.imprimirProductos();
				break;
			case 4:
				System.out.println("Seleccione el articulo que desea");
				v.productosSinVender();
				posicion = Leer.datoInt();
				if (posicion > lista.length || lista[posicion - 1].isVendido()) {
					System.out.println("Error, número de producto inexistente");
				} else {
					System.out.println("Ingrese la cantidad de dinero que le ha dado el comprador");
					dinero = Leer.datoDouble();
					System.out.println("Ingrese la cantidad de ganancia que quiere tener con esta venta");
					ganancia = Leer.datoDouble();

					System.out.println("Su cambio es de: " + v.venderProducto(dinero, posicion, ganancia,fijo));
				}
				break;
			case 0:
				System.out.println("Saliendo..");
				break;

			default:
				System.out.println("Ingrese una opción valida");
				break;

			}
		} while (op != 0);
	}

}
