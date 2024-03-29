package ejercicio2Interfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayReales implements IEstadisticas {
	
	private double [] num;
	

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}
	

	public double[] getNum() {
		return num;
	}


	public void setNum(double[] num) {
		this.num = num;
	}
	


	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}
	public void rellenarArray (int max, int min) {
		Random r= new Random(System.nanoTime());
		for (int i= 0; i < num.length; i++) {
			num[i]=r.nextInt(max-min+1)+1;
		}
	}
	public void mostrarArray (){
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	@Override
	public double calcularMinimo() {
		double min =0;
		int contador = 0;
		for (int i = 0; i < num.length; i++) {
			if (contador==0) {
				min= num [i];
			}else {
				if (num[i]<min) {
					min=num[i];
				}
			}
			contador++;
		}
		return min;
	}

	@Override
	public double calcularMaximo() {
		double max=0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}
			
		}
		return max;
	}

	@Override
	public double calcularSumatorio() {
		double suma= 0;
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		return suma;
	}

}
