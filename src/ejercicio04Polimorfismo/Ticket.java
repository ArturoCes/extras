package ejercicio04Polimorfismo;

import java.util.Arrays;

public class Ticket {
	private LineaDeVenta lista [];
	
	
	public Ticket(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}


	public LineaDeVenta[] getLista() {
		return lista;
	}


	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Ticket [lista=" + Arrays.toString(lista) + "]";
	}


	public void imprimirFactura () {
		double total=0,impuestosAli=2,impuestosEle=21,impuestosRopa=4;
		System.out.println("****************************************************");
		System.out.println("**                   TICKET                       **");
		System.out.println(" Cantidad             Producto                 Precio");
		for (int i = 0; i < lista.length; i++) {
			String nombre =lista[i].getProducto().getNombre();
			double precio1 = lista [i].getProducto().calcularImpuestos(impuestosAli, impuestosEle, impuestosRopa);
			double precio = lista [i].getProducto().calcularPrecioFinal(precio1);
			int cantidad  = lista [i].getCantidad();
			double precioTotal= cantidad*precio;
			total=total+precioTotal;
			System.out.printf("%d \t%s \t%.2f \t%.2f",cantidad,nombre,precio,precioTotal,"\n");
			System.out.println("\n__________________________________________________");
		}
		
		System.out.println(total);
		System.out.println("******************************************************");
	} 
}
