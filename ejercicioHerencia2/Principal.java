package ejercicioHerencia2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int opcion= 0;
	Documento d;
	TarjetaDeVisita t;
	Carta c;
	String fecha = null;
	String encabezado = "Documento principal";
	String encabezado1 ="Tarjeta de visita ";
	String encabezado2 = "Carta";
	String datosDeContacto ="\nNúmero:62288621\n"
			+ "Nombre:Arturo Céspedes Pedrazas\n"
			+ "Dirección:Calle Playa de rota\n";
	d = new Documento(encabezado);
	t = new TarjetaDeVisita (encabezado1,datosDeContacto);
	c = new Carta (encabezado2,fecha);	
	System.out.println("Bienvenido");
	
	do {
	System.out.println("1)Para ver los datos del documento");
	System.out.println("2)Para ver los datos de la tarjeta de visita");
	System.out.println("3)Para ver los datos de la carta");
	System.out.println("0)Para salir");
	opcion=Leer.datoInt();
		switch (opcion) {
		case 1:
			System.out.println(d);
			break;
		case 2:
			System.out.println(t);
			break;
		case 3:
			System.out.println("Introduzca la fecha de salida de la carta");
			fecha=Leer.dato();
			c.setFecha(fecha);
			System.out.println(c);
			break;
		default:
			System.out.println("Error, no existe esa opción");
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		}
	}while (opcion!=0);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Cliente cerrado con éxito");
	System.out.println("Hasta luego");

	
	}
	

}
