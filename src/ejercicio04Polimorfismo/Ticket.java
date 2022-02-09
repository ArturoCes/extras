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
		double total=0,impuestosAli=10,impuestoEle=21,impuestosRopa=10;
		System.out.println("****************************************************");
		System.out.println("**                   TICKET                       **");
		System.out.println("Cntd\tProducto\tUnidad\tcon IVA\t\t Preciofinal");
		for (int i = 0; i < lista.length; i++) {
			String nombre =lista[i].getProducto().getNombre();
			double precioUnitario=lista[i].getProducto().getPrecioUnitario();
			double precio = lista [i].getProducto().calcularPrecioFinal(lista[i].getProducto().calcularImpuestos(impuestosAli, impuestoEle, impuestosRopa));
			int cantidad  = lista [i].getCantidad();
			double precioTotal= cantidad*precio;
			total=total+precioTotal;
			System.out.printf("%d\t%s\t%.2f\t%.2f \t\t%.2f",cantidad,nombre,precioUnitario,precio,precioTotal,"\n");
			System.out.println("\n__________________________________________________");
		}
		
		System.out.printf("%.2f",total);
		System.out.println("\n******************************************************");
	} 
}
