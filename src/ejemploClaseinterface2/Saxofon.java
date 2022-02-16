package ejemploClaseinterface2;

public class Saxofon implements IInstrumento {
	 public void tocar() {
	System.out.println("Saxofon.tocar()");
	 }
	 public String tipo() { return "Saxofon"; }
	 public void afinar() {}
	}
