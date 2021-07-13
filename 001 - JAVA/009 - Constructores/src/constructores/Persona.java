package constructores;

public class Persona {
	
	//variables miembro
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;

	//constructor vacio
	public Persona() {
		this.nombre = "desconocido";
		this.apellidos = "desconocido";
		this.edad = 0;
	}
	
	//cosntructores con parametros
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		this(nombre, apellidos);	//nos aprovechamos del anterior constructor
		this.edad = edad;
	}
	
	//constructor generado con eclipse
	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}
	
	

	//metodos, comportamientos de los objetos
	void caminar() { System.out.println("Caminando.");}
		
	void hablar() { System.out.println("Hablando.");}
		
	void nacer() { System.out.println("Naciendo.");}
		
	void programar() { System.out.println("Desarrollando.");}

}
