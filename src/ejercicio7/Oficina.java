package ejercicio7;

public class Oficina {
	//Aquí lo ideal seria una lista de cuentas pero aún no lo hacemos por que eso entra en el siguiente examen
	private Cuenta cuenta;
	private int id;
	
	//Constructor
	public Oficina(Cuenta c, int id) {
		super();
		this.cuenta = c;
		this.id = id;
	}

	//Getters and Setters
	public Cuenta getC() {
		return cuenta;
	}


	public void setC(Cuenta c) {
		this.cuenta = c;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	//toString
	@Override
	public String toString() {
		return "Oficina [c=" + cuenta+ ", id=" + id + "]";
	}
	//Los métodos que nos pide el enunciado
	
	public void ingresar (double cantidad) {
		this.cuenta.setSaldo(this.cuenta.getSaldo()+cantidad);
	}
	public boolean  retirar (double cantidad) {
		if(cantidad<=cuenta.getSaldo()) { 
		cuenta.setSaldo(cuenta.getSaldo()-cantidad);
		return true;
		
	}else {
		return false;
	}
	//Otra posible versión sería sin objeto
	
	
	}
	public void imprimirMensaje (boolean b) {
		if (b) {
			System.out.println("Todo ok");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
