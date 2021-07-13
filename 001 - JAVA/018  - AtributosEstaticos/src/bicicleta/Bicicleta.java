package bicicleta;

public class Bicicleta {
	
	//variables globales
	private static int numeroDeBicicletas = 0;
	
	//variables miembro
	private int numMarchas;
	private int diametroRueda;
	private int velocidad;
	private int id;

	//constructores
	public Bicicleta() {
		this.id = ++numeroDeBicicletas;
	}
	
	public Bicicleta(int numMarchas, int diametroRueda, int velocidad) {
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
		this.velocidad = velocidad;
		this.id = ++numeroDeBicicletas;
		
	}

	//getters
	public int getNumMarchas() {
		return numMarchas;
	}

	public int getDiametroRueda() {
		return diametroRueda;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getId() {
		return id;
	}

	//setters
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public void setDiametroRueda(int diametroRueda) {
		this.diametroRueda = diametroRueda;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//otros metodos
	
	public static int getNumeroDeBicicletas() {
		return numeroDeBicicletas;
	}

	@Override
	public String toString() {
		return "Bicicleta [id=" + id + ", numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda
				+ ", velocidad=" + velocidad + "]";
	}
	
	
}
