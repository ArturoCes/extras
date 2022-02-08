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




}
