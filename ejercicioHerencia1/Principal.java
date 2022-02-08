package ejercicioHerencia1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenador o=new Ordenador("2Tb", 2.30, 1000);				
		Tablet t = new Tablet("1tb", 2.20, 10, 100);
		Portatil p = new Portatil ("1tb", 1.50, 200, 10);
		double pS=0.0,dsC=0.0;
		
	
		
		System.out.println(o);
		System.out.println(t);
		System.out.println(p);
		
	}
	
}
