package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Trabajador t= new Trabajador ("Miguel","profesor");
	Empleado e= new Empleado ("Pepe","Analista",1200.0,20.0);
	Consultor c= new Consultor ("Rafa","Junior",42,55.50);
	int tope =8;
	
	System.out.println(t.calcularPaga());
	System.out.println(e.calcularPaga());
	System.out.println(c.calcularPaga());
	
	c.avisarHExtras(tope);
	
	}

}
