package ejercicio6HerenciaPolimorfismo;

import java.util.Arrays;

public class Oficina {
	private Cuenta c [];
	//Constructor
	public Oficina(Cuenta[] c) {
		super();
		this.c = c;
	}
	//Getters & Setters
	public Cuenta[] getC() {
		return c;
	}
	public void setC(Cuenta[] c) {
		this.c = c;
	}
	//To String
	@Override
	public String toString() {
		return "Oficina [c=" + Arrays.toString(c) + "]";
	}
	
	
	
}
