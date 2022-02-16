package ejemploClaseinterface2;

public class Musica3 {
	 // No importa el tipo de Instrumento,
	 // seguirá funcionando debido a Polimorfismo:
	
	 static void afinar(IInstrumento i) {
	// ...
		 i.tocar();
	 }
	 public Musica3() {
		super();
		// TODO Auto-generated constructor stub
	}
	static void afinarTodo(IInstrumento[] e) {
	for(int i = 0; i<e.length; i++){
	 afinar(e[i]);
	}
   }	
}