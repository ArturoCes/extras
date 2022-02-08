package ejercicio7;

public class Cuenta {
		
	
	//Atributos
	//No se puede instanciar ningún objeto acá en los atributos, ni darle valores;
	private double saldo;
	private String nombreTitutlar;
	
	public Cuenta(double saldo, String nombreTitutlar) {
		this.saldo = saldo;
		this.nombreTitutlar = nombreTitutlar;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNombreTitutlar() {
		return nombreTitutlar;
	}


	public void setNombreTitutlar(String nombreTitutlar) {
		this.nombreTitutlar = nombreTitutlar;
	}


	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", nombreTitutlar=" + nombreTitutlar + "]";
	}
	
	
	//Métodos
	
	
	
}
