package ejercicio6HerenciaPolimorfismo;

public class CuentaCorriente extends Cuenta {
	private double mantenimientoFijo;
	//Constructor
	public CuentaCorriente(double saldoCuenta, String nombrePropietario, double mantenimientoFijo) {
		super(saldoCuenta, nombrePropietario);
		this.mantenimientoFijo = mantenimientoFijo;
	}
	//Getters & Setters
	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}
	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}
	//To String
	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + "]";
	}
	public double ingresarDinero (double ingreso) {
		double res= getSaldoCuenta()+ingreso-mantenimientoFijo;
		setSaldoCuenta(res);
		return res;
		
	}
	public double retirarDinero (double retiro) {
		double res= getSaldoCuenta()-retiro;
		setSaldoCuenta(res);
		return res;
		
	}
	

}
	