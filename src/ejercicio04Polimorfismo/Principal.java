package ejercicio04Polimorfismo;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int op =1;
		 int tam= 5;
		Producto producto= new Alimentacion (20, "Leche", 1,false);
		Producto ali = new Alimentacion  (5, "Pan", 2, true);
		Producto ali2 = new Alimentacion  (5, "Yogurt", 2, false);
		Producto pc = new Electronica (500, "RogStrix", 3, "Asus");
		Producto pantalon = new Ropa (10, "Pantalon",4, "S", "Rojo");
		LineaDeVenta [] lineaA = new LineaDeVenta[tam];
		LineaDeVenta linea = new LineaDeVenta (producto, 2);
		LineaDeVenta linea2 = new LineaDeVenta (ali, 2);
		LineaDeVenta linea3 = new LineaDeVenta (ali2, 2);
		LineaDeVenta linea4 = new LineaDeVenta (pc, 2);
		LineaDeVenta linea5 = new LineaDeVenta(pantalon, 3);
		lineaA[0]=linea;
		lineaA[1]=linea2;
		lineaA[2]=linea3;
		lineaA[3]=linea4;
		lineaA[4]=linea5;
		Ticket ticket = new Ticket (lineaA);
		
		
		System.out.println("Bienvenido");
		System.out.println("Elija la opción que desea");
		do {
		System.out.println("1) Para ver todos los productos");
		System.out.println("2)Para imprimir factura");
		
		op=Leer.datoInt();
			switch (op) {
			case 1:
				for (int i = 0; i < lineaA.length; i++) {
					System.out.println(lineaA[i]);
				}
				break;
			case 2:
			ticket.imprimirFactura();
				break;
			default:
				break;
			}
		}while (op!=0);
	}

}
