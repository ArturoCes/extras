package FiguraEjemplo;

public abstract class Figura {
	
	//PUNTOS PARA GRAFICAR
	
	private double x;
	private double y;
	
	//EL CONSTRUCTOR NO LO USAMOS PARA INSTANCIAR SINO PARA DEFINIR
	public Figura(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public abstract double calcularArea();
}


