package ejercicio05array;

public class Electrodomestico {
	private double precioBase;
	private String color;
	private char consumoElectrico;
	private double peso;
	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.peso = peso;
		comprobarConsumoEnergetico();
		comprobarColor();
		
	}
	public Electrodomestico (double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumoElectrico = 'F';
		this.peso = peso;
		
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoElectrico() {
		return consumoElectrico;
	}
	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoElectrico=" + consumoElectrico
				+ ", peso=" + peso + "]";
	}
	public void comprobarColor () {
		boolean disponible=true;
		String color []= {"Azul","Blanco","Negro","Naranja","Marron"};
		for (int i = 0; i < color.length; i++) {
			if(this.color.equalsIgnoreCase(color[i])) {
				disponible=false;
				
			}
			
		}
		if(disponible) {
			this.color="Blanco";
		}
		
	}
	public void comprobarConsumoEnergetico () {
		boolean noEncontrado=true;
		char letra []= {'A','B','C','D','F','a','b','c','d','f'};
		for (int i = 0; i < letra.length; i++) {
			if(letra [i]==this.consumoElectrico) {
				noEncontrado=false;
			}
			
		}
		if(noEncontrado) {
			this.consumoElectrico='F';
			
		}
	
	}
	public double comprobarPrecioFinal (int consumo,double precioBase) {
		double precioFinal;
		precioFinal=precioBase+consumo;
		return precioFinal;
	}

}
