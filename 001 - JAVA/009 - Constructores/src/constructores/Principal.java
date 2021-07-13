package constructores;

public class Principal {

	public static void main(String[] args) {
		
		//creamos una persona
		Persona persona = new Persona("Jorge", "Victoria Andreu", 45, 172, 89);
		
		//usamos sus metodos
		persona.nacer();
		persona.hablar();
		persona.caminar();
		persona.programar();

	}

}
