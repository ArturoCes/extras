package ejercicio03Array;

import java.util.Arrays;

public class Vendedor {
	
	private Movil [] listado;
	private int totalVendido;
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendedor(Movil[] listado, int totalVendido) {
		super();
		this.listado = listado;
		this.totalVendido = totalVendido;
	}
	public Movil[] getListado() {
		return listado;
	}
	public void setListado(Movil[] listado) {
		this.listado = listado;
	}
	public int getTotalVendido() {
		return totalVendido;
	}
	public void setTotalVendido(int totalVendido) {
		this.totalVendido = totalVendido;
	}
	@Override
	public String toString() {
		return "Vendedor [listado=" + Arrays.toString(listado) + ", totalVendido=" + totalVendido + "]";
	}
	public boolean comprobarMoviles () {
		boolean no=false;
		for (int i = 0; i < listado.length; i++) {
			if(listado [i].isEstaVendido()) {
				no=true;
			}		
		}
			return no;
	}
	public void imprimirMovil () {
		if(comprobarMoviles()) {
			System.out.println("Si hay moviles");
		}else {
			System.out.println("No hay moviles");
		}
	}
	public void mostrarDisponibles () {
		for (int i = 0; i < listado.length; i++) {
			if (!listado[i].isEstaVendido()) {
			System.out.println(listado[i]);	
			}		
		}
	
	}
	public int precioFinal (Movil movil, int descuento) {
		
			return movil.getPrecioUnitario()-descuento;
		
	}
	
	
	
}
