package orientacionObjetos;

public class Principal {

	public static void main(String[] args) {
		
		//crear objeto persona
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		
		//usamos sus metodos
		persona.nacer();
		persona.hablar();
		persona.caminar();
		persona.morir();
		
		System.out.println();
		
		//usamos sus metodos
		persona2.nacer();
		persona2.hablar();
		persona2.caminar();
		persona2.morir();
		
		System.out.println();
		
		//usamos sus metodos
		persona3.nacer();
		persona3.hablar();
		persona3.caminar();
		persona3.morir();

	}

}
