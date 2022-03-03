package ejercicio1Colecciones;

public class Notas {
	private int id;
	private String titulo;
	private String cuerpo;
	private boolean favorito;
	//Constructor
	public Notas(int id, String titulo, String cuerpo, boolean favorito) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.favorito = favorito;
	}
	//Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public boolean isUrgente() {
		return favorito;
	}
	public void setUrgente(boolean urgente) {
		this.favorito = urgente;
	}
	//To String
	@Override
	public String toString() {
		return "Notas [id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", favorito=" + favorito + "]";
	}
	
	
	
}
