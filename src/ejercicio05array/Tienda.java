package ejercicio05array;

import java.util.Arrays;

public class Tienda {

private Electrodomestico electrodomestico [];


	public Tienda() {
	super();
	// TODO Auto-generated constructor stub
}

	public Tienda(Electrodomestico[] electrodomestico) {
		super();
		this.electrodomestico = electrodomestico;
	}
	
	public Electrodomestico[] getElectrodomestico() {
		return electrodomestico;
	}
	
	public void setElectrodomestico(Electrodomestico[] electrodomestico) {
		this.electrodomestico = electrodomestico;
	}
	
	@Override
	public String toString() {
		return "Tienda [electrodomestico=" + Arrays.toString(electrodomestico) + "]";
	}
	public double comprobarPrecioFinal (int posicion) {
		double calculo=electrodomestico[posicion].getPrecioBase();
		char letra=electrodomestico[posicion].getConsumoElectrico();
		int consumoElectrico1 [] = {100,80,60,50,30,10};
		double resultado=0;
		switch (letra) {
		case 'A':
			resultado=calculo+consumoElectrico1[0];
			break;
		case 'B':
			resultado=calculo+consumoElectrico1[1];
			break;
		case 'C':
			resultado=calculo+consumoElectrico1[2];
			break;
		case 'D':
			resultado=calculo+consumoElectrico1[3];
			break;
		case 'E':
			resultado=calculo+consumoElectrico1[4];
			break;
		case 'F':
			resultado=calculo+consumoElectrico1[5];
			break;
		

		default:
			break;
		}
		return resultado;
		
	}
	public double sumaFinal () {
		double resultado = 0;
		for (int i = 0; i < electrodomestico.length; i++) {
			resultado=resultado+comprobarPrecioFinal(i);
		}
		return resultado;
		
	}
	public double calcularMediaPrecioFinal () {
		return sumaFinal()/electrodomestico.length;
	}
}
