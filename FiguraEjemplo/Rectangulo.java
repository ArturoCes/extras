package FiguraEjemplo;

public class Rectangulo extends Figura{
private double altura, base;

	public Rectangulo (double x, double y, double b, double h) {
		super(x, y);
		this.altura=h;
		this.base=b;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}
	
}
