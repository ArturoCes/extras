package ejercicio8;

import java.util.Random;

public class Sorteo {
	
	private int billete;
	
	public Sorteo(int billete) {
		super();
		this.billete = billete;
	}
	public Sorteo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int comprobarGanador (int billete) {
	
		int ganador=hacerSorteo();
		int resultado;
		if(ganador==billete) {
		resultado=0;
		}else {
			resultado=ganador;
		}
		return resultado;
	}
	
	public int hacerSorteo () {
		int desde = 100000000, hasta=999999999;
		Random random = new Random();
		int randomNumber = random.nextInt(hasta-desde+1)+desde;
		return randomNumber;
	}
	public int generarDecimo () {
		int desde = 100000000, hasta=999999999;
		Random random = new Random();
		int randomNumber = random.nextInt(hasta-desde+1)+desde;
		
		return randomNumber;
	}
	public int getBillete() {
		return billete;
	}
	
	public void setBillete(int billete) {
		this.billete = billete;
	}
	
	
}
