package ejemploClaseinterface2;

public class Guitarra implements IInstrumento {
	 public void tocar() {
	System.out.println("Guitarra.tocar()");
	 }
	 public String tipo() { return "Guitarra"; }
	 public void afinar() {}
	}