package ejercicioHerencia3;

import java.util.Arrays;

public class Gestion {

	private Vehiculo listaVehiculos [];

	public Gestion(Vehiculo[] listaVehiculos) {
		super();
		this.listaVehiculos = listaVehiculos;
	}

	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	@Override
	public String toString() {
		return "Gestion [listaVehiculos=" + Arrays.toString(listaVehiculos) + "]";
	}

	public void añadirVehiculo (Vehiculo vehiculo, int posicion) {
		
		for (int i = 0; i < listaVehiculos.length; i++) {
			listaVehiculos[posicion]=vehiculo;
			
		}
	}
}
	
	

