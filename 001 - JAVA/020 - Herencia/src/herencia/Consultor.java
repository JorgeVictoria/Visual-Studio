package herencia;

public class Consultor extends Trabajador {
	
	//variables miembro
	private int horas;
	private double tarifa;
	
	//constructor
	public Consultor(String nombre, String puesto, String direccion, String telefono, String nSS, int horas, double tarifa) {
		super(nombre, puesto, direccion, telefono, nSS);
		// TODO Auto-generated constructor stub
		this.horas = horas;
		this.tarifa = tarifa;
	}

	//getters
	public int getHoras() {
		return horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	//setters
	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	//otros metodos
	public double calculaCoste() {
		return this.getHoras() * this.getTarifa();
	}

	@Override
	public String toString() {
		return "Consultor [Nombre=" + getNombre() + ", Puesto=" + getPuesto() + ", Direccion="
				+ getDireccion() + ", Telefono=" + getTelefono() + ", nSS=" + getnSS() + ", tarifa=" + tarifa
				+ "]";
	}

	
	
	
	
	
	

}
