package ejercicio02Array;

public class Hotel {
	private Habitacion [] lista;

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}
	
	public boolean comprobarLimpieza(int numH) {
		return lista [numH-1].isLimpia();
	}
	
	public void imprimirLimpia (int numH) {
		if(comprobarLimpieza(numH)) {
			System.out.println("La habitaciónn está hecha");
		}else {
			System.out.println("TodavÃ­a no se ha limpiado la habitación");
		}
	}
	public double calcularPrecio (int numH) {
		return lista[numH].getPrecioB()*lista[numH-1].getNumDias();
	}
	public void imprimirListado () {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	public double calcularPrecioExtras (int numH,double extras) {
		if(lista[numH].isExtras()) {
			return calcularPrecio(numH)+extras;
		}else {
			return calcularPrecio(numH);
		}
		
	}
}

