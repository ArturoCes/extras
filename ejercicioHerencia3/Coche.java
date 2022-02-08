package ejercicioHerencia3;

public class Coche extends Vehiculo{
	
	
	
	public Coche(double cilindrada, double caballos, String tipoCombustible) {
		super(cilindrada, caballos, tipoCombustible);
	}
		

	public double calcularImpuestos() {
		
		return 1000+(getCilindrada()*25/100);
	}


	@Override
	public String toString() {
		return super.toString()+"\nCoche\n Impuestos:" + calcularImpuestos();
	}
	
	
	
	
	
}
