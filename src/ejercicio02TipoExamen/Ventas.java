package ejercicio02TipoExamen;

import java.util.Arrays;

public class Ventas {

	private Producto lista[];
	private static double cantidadTotal;

	// Constructor
	public Ventas(Producto[] lista) {
		super();
		this.lista = lista;
	}

	// Getters & Setters
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public static double getCantidadTotal() {
		return cantidadTotal;
	}

	public static void setCantidadTotal(double cantidadTotal) {
		Ventas.cantidadTotal = cantidadTotal;
	}

	// To String
	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}

	public void productosSinVender() {

		for (int i = 0; i < lista.length; i++) {
			if (!lista[i].isVendido()) {
				System.out.println(i + 1 + ".-" + lista[i]);
			}
		}

	}

	public void imprimirProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(i + 1 + ".-" + lista[i]);
		}
	}

	public double venderProducto(double dinero, int posicion, double ganancia, double fijo) {
		int uno = 1;

		if (dinero >= lista[posicion - 1].getPrecioBase() + ganancia) {
			lista[posicion - 1].setCantidad(lista[posicion - 1].getCantidad() - uno);

			if (lista[posicion - 1].getCantidad() == 0) {
				lista[posicion - 1].setVendido(true);
			}
			cantidadTotal = cantidadTotal + lista[posicion - 1].calcularPVP(ganancia, fijo);
			if (lista[posicion-1]instanceof EspadaLaser) {
				((EspadaLaser)lista[posicion-1]).imprimirMensaje();
			}
			return dinero - lista[posicion - 1].calcularPVP(ganancia, fijo);
		} else {
			System.out.println("Dinero insuficiente");
		}
		return dinero;

	}

}
