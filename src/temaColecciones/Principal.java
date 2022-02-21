package temaColecciones;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a = new Alumno("Arturo", "Céspedes Pedrazas", 20, "29654516H");
		Alumno b = new Alumno("Richard", "Céspedes Pedrazas", 21, "29654515V");
		Alumno c = new Alumno("Ignacio", "Moreno Gómez", 18, "132465798C");
		
		List<Alumno>listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(a);
		listaAlumnos.add(b);
		listaAlumnos.add(c);
		/*List<String> lista = new ArrayList<String>(); 
		List<Integer>lista2 = new ArrayList <Integer>();
		lista2.add(2);
		lista.add("Pedro");
		lista.add("Arturo");
		System.out.println(lista);
		System.out.println(lista2);*/
		
		
	
		System.out.println(listaAlumnos);
	}

}
