package ejercicio03Array;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=1;
		Movil movil = new Movil("Samsung","Galaxy Mini",true,100);
		Movil movil2 = new Movil("Samsung","Galaxy S3",false,500);
		Movil listado [] = new Movil [tam];
		Vendedor v = new Vendedor (listado,2);
		Random random = new Random ();
		int desde=5,hasta=15,descuento=0;
		
		descuento=random.nextInt(hasta-desde+1)-desde;
		
	
		listado[0]=movil;
		v.imprimirMovil();
		v.mostrarDisponibles();
		System.out.println("El precio final sera "+v.precioFinal(movil, descuento));
	}

}
