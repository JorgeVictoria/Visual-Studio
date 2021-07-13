package gettersSetters;

public class Principal {

	public static void main(String[] args) {
		
		//creamos una persona
		Persona persona = new Persona("Jorge", "Victoria Andreu", 45, 172, 89);
		
		//se presenta
		persona.presentarse();
		
		//vemos todos sus datos. Llamada directa a toString
		System.out.println(persona);

	}

}
