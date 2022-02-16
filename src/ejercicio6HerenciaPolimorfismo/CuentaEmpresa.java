package ejercicio6HerenciaPolimorfismo;

	public class CuentaEmpresa extends Cuenta{
	 private int coste;
	 //Constructor
	
	 public CuentaEmpresa(double saldoCuenta, String nombrePropietario, int coste) {
		super(saldoCuenta, nombrePropietario);
		this.coste = 1;
	 }
	 //Getters & Setters
	
	public int getCoste() {
		return coste;
	}
	
	public void setCoste(int coste) {
		this.coste = coste;
	}
	//To String
	
	@Override
	public String toString() {
		return super.toString()+"CuentaEmpresa [coste=" + coste + "]";
	}

	public double ingresarDinero (double ingreso) {
		double res=(getSaldoCuenta()+ingreso);
		setSaldoCuenta(res);
		return  res;
	}
	public double retirarDinero (double retiro) {
		double res=(getSaldoCuenta()-retiro)-coste;
		setSaldoCuenta(res);
		return res;
	}
}
