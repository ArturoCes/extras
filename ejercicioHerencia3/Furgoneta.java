	package ejercicioHerencia3;

public class Furgoneta extends Vehiculo{

	private double	impuestoFijoExtra;

	public Furgoneta(double cilindrada, double caballos, String tipoCombustible, double impuestoFijoExtra) {
		super(cilindrada, caballos, tipoCombustible);
		this.impuestoFijoExtra = impuestoFijoExtra;
	}

	public double getImpuestoFijoExtra() {
		return impuestoFijoExtra;
	}

	public void setImpuestoFijoExtra(double impuestoFijoExtra) {
		this.impuestoFijoExtra = impuestoFijoExtra;
	}

	@Override
	public String toString() {
		return super.toString()+"\nFurgoneta\n"
				+ "\nImpuestos extra:" + impuestoFijoExtra;
	}
	public double calcularImpuestos() {
		
		return 1000+impuestoFijoExtra;
	}
		
	
}
