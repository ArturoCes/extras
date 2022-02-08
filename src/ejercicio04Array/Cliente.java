package ejercicio04Array;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean actividad;
	private double peso, altura;
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String dni, String nombre, String apellidos, boolean actividad, double peso, double altura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.actividad = actividad;
		this.peso = peso;
		this.altura = altura;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean isActividad() {
		return actividad;
	}
	public void setActividad(boolean actividad) {
		this.actividad = actividad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		if(actividad) {
			System.out.println("Actividad:Activo");
		}
		else {
			System.out.println("Actividad:Inactivo");
		}
		return "Cliente \n"
				+"Dni:" + dni +"\n"
				+"Nombre:" + nombre +"\n" 
			    +"Apellidos:" + apellidos+ "\n"+ 
			    	"Peso:" + peso + "\n"
				+"Estatura:" + altura+"\n";
	}
	public double calcularIMC () {
		return peso/Math.pow(altura, 2);
		
		
	}
	public void imprimirIMC () {
		System.out.println("Su indíce de masa corporal es : "+calcularIMC());
		
	}
	
}

