package ejercicio6HerenciaPolimorfismo;

public class Cuenta {
	private double saldoCuenta;
	private String nombrePropietario;
	//Constructor
	public Cuenta(double saldoCuenta, String nombrePropietario) {
		super();
		this.saldoCuenta = saldoCuenta;
		this.nombrePropietario = nombrePropietario;
	}
	//Getters & Setters
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	//To String
	@Override
	public String toString() {
		return "Cuenta [saldoCuenta=" + saldoCuenta + ", nombrePropietario=" + nombrePropietario + "]";
	}
	
	public double ingresarDinero (double ingreso) {
		return 0;
	}
	public double retirarDinero (double retiro) {
		return 0;
	}

	
}
