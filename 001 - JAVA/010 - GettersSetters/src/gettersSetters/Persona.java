package gettersSetters;

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
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//otros metodos
	public void presentarse() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellidos() + ". Tengo " + this.getEdad() + " años.");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + " años, altura=" + altura + "cm"
				+ ", peso=" + peso + "kg ]";
	}

}
