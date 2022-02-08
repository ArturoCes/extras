package intento;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int cantidad=0,precio=0,opcion=0;
	String nombre="";
	System.out.println("Hola,bienvenido");
	System.out.println("Ingrese la cantidad de productos que ingresara");
	cantidad=Leer.datoInt();
	System.out.println("Ingrese el precio del producto");
	precio=Leer.datoInt();
	System.out.println("Ingrese el nombre del producto");
	nombre=Leer.dato();
	
	Producto producto=new Producto(cantidad,precio,nombre);
	Tienda tienda=new Tienda(producto);
	do {
	System.out.println("(1) Para ver producto");
	System.out.println("(2)Para modificar el precio del producto");
	System.out.println("(3)Para eliminar un producto");
	opcion=Leer.datoInt();
	switch (opcion) {
		case 1:
			if(tienda.getProducto().isEmpty()) {
			System.out.println("No existen productos disponibles");
			}else {
			System.out.println(tienda.getProducto());
			}
			break;
		case 2:
			System.out.println("Ingrese el nuevo precio");
			precio=Leer.datoInt();
			producto.setPrecio(precio);
			break;
		case 3:
			cantidad=0;
			precio=0;
			nombre="";
			tienda.getProducto().setCantidad(cantidad);
			tienda.getProducto().setNombre(nombre);
			tienda.getProducto().setPrecio(precio);
			System.out.println("Producto eliminado con exito");
			break;
			}
		}while (opcion!=0);
	}
}
