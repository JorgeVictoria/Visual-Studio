package argumentos;

public class usoVarargs {

	public static void main(String[] args) {
		
		//pasamos todas las cadenas que queramos
		imprimeMensajes("En un lugar", "de la Mancha");
		imprimeMensajes("de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo");
		imprimeMensajes("...");
		imprimeMensajes();

	}

	//aqui varargs funciona como un array
	public static void imprimeMensajes(String...mensajes) {
		
		for(String mensaje : mensajes) {
			System.out.print(mensaje + " ");
		}
		
		System.out.println();
		
	}

}
