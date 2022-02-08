package ejercicio07Array;

public class Monedero {
 private double dinero;

public Monedero(double dinero) {
	super();
	this.dinero = dinero;
}

public double getDinero() {
	return dinero;
}

public void setDinero(double dinero) {
	this.dinero = dinero;
}

@Override
public String toString() {
	return "Monedero [dinero=" + dinero + "]";
}
 
public double crearMonedero (double dinero, double dineroIngresado) {
	
	return dinero + dineroIngresado;
	
}
public double ingresarDinero (double dinero, double dineroIngresado) {
	this.dinero=dinero+dineroIngresado;
	return this.dinero;
}
public double retirarDinero (double dinero, double dineroIngresado) {
	this.dinero=dinero-dineroIngresado;
	return this.dinero;
}
}
