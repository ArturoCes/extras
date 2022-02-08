package ejercicioHerencia2;

public class TarjetaDeVisita extends Documento{

	private String DatosDeContacto;

	public TarjetaDeVisita(String encabezado, String datosDeContacto) {
		super(encabezado);
		DatosDeContacto = datosDeContacto;
	}

	public String getDatosDeContacto() {
		return DatosDeContacto;
	}

	public void setDatosDeContacto(String datosDeContacto) {
		DatosDeContacto = datosDeContacto;
	}

	@Override
	public String toString() {
		return super.toString()+"\nDatos de contacto:" + DatosDeContacto;
	}
	
	
}
