package ejercicio04Array;

import java.util.Arrays;

public class Gimnasio {
	private Cliente listaClientes [];

	public Gimnasio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gimnasio(Cliente[] listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "Gimnasio [listaClientes=" + Arrays.toString(listaClientes) + "]";
	}

}
