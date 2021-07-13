package sobrecarga;

public class Persona {
	
	//variables miembro
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;

	//constructores. Creamos uno vacio y un par mas con diferentes argumentos, para ver la sobrecarga
	public Persona() {
	}

	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
		this(nombre, apellidos);
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	//getters
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	public float getPeso() {
		return peso;
	}

	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	//otros metodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
}
