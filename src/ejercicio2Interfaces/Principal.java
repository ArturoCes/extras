package ejercicio2Interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=8;
		double [] a = new double [tam];
		ArrayReales ae = new ArrayReales(a);
		ae.rellenarArray(20, 5);
		
	
		
	ae.mostrarArray();
	}

}
