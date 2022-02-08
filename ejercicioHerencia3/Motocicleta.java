package ejercicioHerencia3;

public class Motocicleta extends Vehiculo {
	private double potencia;
	

	public Motocicleta(double cilindrada, double caballos, String tipoCombustible, double potencia) {
		super(cilindrada, caballos, tipoCombustible);
		this.potencia = potencia;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	@Override
	public String toString() {
		return super.toString()+"\nMotocicleta "
				+ "\nPotencia: " + potencia;
	}
			
	public double calcularImpuestos() {
		
		return 1000+(potencia*100/60);
		
	}
	
}
