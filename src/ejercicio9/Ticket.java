package ejercicio9;

public class Ticket {
	private int numeroTicket;
	private int precioTicket;
	public Ticket() {
		super();
	}
	public Ticket(int numeroTicket, int precioTicket) {
		super();
		this.numeroTicket = numeroTicket;
		this.precioTicket = precioTicket;
	}
	public int getNumeroTicket() {
		return numeroTicket;
	}
	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}
	public int getPrecioTicket() {
		return precioTicket;
	}
	public void setPrecioTicket(int precioTicket) {
		this.precioTicket = precioTicket;
	}
	@Override
	public String toString() {
		return "Ticket [numeroTicket=" + numeroTicket + ", precioTicket=" + precioTicket + "]";
	}
	
}
