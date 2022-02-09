package ejercicioP;

import java.util.Arrays;

public class GestionPlataforma {
	/**
	 * Atributos
	 */
	private Deposito deposito [];
	private static int capacidadMaxima;
	/**
	 * Constructor
	 */
	public GestionPlataforma(Deposito[] deposito) {
		super();
		this.deposito = deposito;
	}
	
		/**
		 * Getters & Setters
		 */
		public Deposito[] getDeposito() {
			return deposito;
		}

		public void setDeposito(Deposito[] deposito) {
			this.deposito = deposito;
		}

		public static int getCapacidadMaxima() {
			return capacidadMaxima;
		}

		public static void setCapacidadMaxima(int capacidadMaxima) {
			GestionPlataforma.capacidadMaxima = capacidadMaxima;
		}
		@Override
		public String toString() {
			return "GestionPlataforma [deposito=" + Arrays.toString(deposito) + "]";
		}
		public void añadirDeposito (double altura, double radio, int capacidad,int posicion,double precioBase) {
			deposito[posicion]=new Deposito (altura,radio,capacidad, precioBase);
		}
		public double calcularGanancia (int posicion,double porcentaje) {
			return porcentaje/100*deposito[posicion-1].getPrecioBase();
		}
		public double calcularPrecioFinal(int posicion,double porcentaje) {
			return deposito[posicion-1].getPrecioBase()+calcularGanancia(posicion, porcentaje);
		}
		public double calcularGananciaRepsol (int posicion, double precioLitro) {
			return deposito[posicion-1].getContenido()*precioLitro;
		}
		public void imprimirMenuPpal() {
			System.out.println("\n1)Ingresar nuevo deposito");
			System.out.println("2)Calcular precio con ganancia");
			System.out.println("3)Calcular precio con ganancia para Repsol");
			System.out.println("4)Calcular volumen de un depósito");
			System.out.println("5)Mostrar todos los depositos");
		
		}
}
