package ejercicioHerencia2;

	public class Documento {
	private String encabezado;
	
	public Documento(String encabezado) {
		super();
		this.encabezado = encabezado;
	}
	
	public String getEncabezado() {
		return encabezado;
	}
	
	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}
	
	@Override
	public String toString() {
		return "Documento Encabezado:" + encabezado ;
	}
	
	
}
