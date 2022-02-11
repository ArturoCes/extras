package ejemploClaseInterface;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cabecera ="Salesianos Triana";
		String cuerpo = "Estimados alumnos: \nBienvenidos al ciclo de formación profesional";
		Web w = new Web ("Salesianos.jpg");
		Carta c = new Carta (cabecera,cuerpo);
		c.imprimirAteriscos();
		w.imprimirAteriscos();
	}

}
