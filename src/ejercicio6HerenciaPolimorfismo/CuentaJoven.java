package ejercicio6HerenciaPolimorfismo;

public class CuentaJoven extends Cuenta{
	private int regalo;
 //Constructor
	public CuentaJoven(double saldoCuenta, String nombrePropietario, int regalo) {
		super(saldoCuenta, nombrePropietario);
		this.regalo = regalo;
	}
 //Getters & Setters
	public int getRegalo() {
		return regalo;
	}
	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}
	//To String
	@Override
	public String toString() {
		return super.toString()+"CuentaJoven [regalo=" + regalo + "]";
	}
	public double ingresarDinero (double ingreso) {
		double res=getSaldoCuenta()+ingreso+regalo;
		setSaldoCuenta(res);
		return res;
	}
	public double retirarDinero (double retiro) {
		double res= getSaldoCuenta()-retiro;
		setSaldoCuenta(res);
		return res;
	}
}
