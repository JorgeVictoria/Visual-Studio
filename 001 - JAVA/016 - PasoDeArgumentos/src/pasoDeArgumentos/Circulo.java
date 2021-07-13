package pasoDeArgumentos;

public class Circulo {

	//variables miembro
	private int x;
	private int y;
	private int radio;
	
	//constructores
	public Circulo(int x, int y) {
		this.x = x;
		this.y = y;
		this.radio = 1;
	}

	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	//constructor para copias del circulo
	public Circulo(Circulo circulo) {
		this.x = circulo.getX();
		this.y = circulo.getY();
		this.radio = circulo.getRadio();
	}

	//getters y setters
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	//metodos varios
	
	@Override
	public String toString() {
		return "Circulo [x=" + x + ", y=" + y + ", radio=" + radio + "]";
	}
	
	
	
	
	
}
