package herencia;

public class Empleado extends Trabajador {	//indicamos que es hija de Trabajador
	
	//variables locales
	private static final int PAGAS = 14;
	
	//variables miembro
	private double sueldo;
	private double impuestos;
	
	//constructor
	public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS, double sueldo, double impuestos) {
		super(nombre, puesto, direccion, telefono, nSS);	//llama a la clase padre
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	//getters
	public double getSueldo() {
		return sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	//setters
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	public double calculaPagas() {
		
		return (sueldo - impuestos) / PAGAS;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre=" + getNombre() + ", Puesto=" + getPuesto() + ", Direccion="
				+ getDireccion() + ", Telefono=" + getTelefono() + ", nSS()=" + getnSS() + ", sueldo=" + sueldo
				+ ", impuestos=" + impuestos + "]";
	}

	

	

	
	
	
	
	
	
	

}
