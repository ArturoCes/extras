package ejercicioHerencia3;

public class Vehiculo {
	private double cilindrada;
	private double caballos;
	private String tipoCombustible;
	
	
	
	
	public Vehiculo(double cilindrada, double caballos, String tipoCombustible) {
		super();
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.tipoCombustible = tipoCombustible;
	}



	public double getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}



	public double getCaballos() {
		return caballos;
	}



	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}



	public String getTipoCombustible() {
		return tipoCombustible;
	}



	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}



	@Override
	public String toString() {
		return "Vehiculo\n"
				+ "Cilindrada:" + cilindrada +
				"\nCaballos:" + caballos +
				"\nTipo de combustible:" + tipoCombustible;
	}
	
	public double calcularImpuestos () {
		
	
		
		return 1000;
		
	}
	
	
}
