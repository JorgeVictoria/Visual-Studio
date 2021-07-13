package herencia;

public class Trabajador {
	
	//variables miembro
	private String nombre;
	private String puesto;
	private String direccion;
	private String telefono;
	private String nSS; //Numero Seguridad Social
	
	//constructores
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}

	public Trabajador(String nombre, String puesto, String direccion, String telefono, String nSS) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nSS = nSS;
	}

	//getters
	public String getNombre() {
		return nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getnSS() {
		return nSS;
	}

	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setnSS(String nSS) {
		this.nSS = nSS;
	}

	//otros metodos
	@Override
	public String toString() {
		return "Trabajador [Nombre=" + nombre + ", Puesto=" + puesto + ", Direccion=" + direccion + ", Telefono="
				+ telefono + ", nSS=" + nSS + "]";
	}
	
	

}
