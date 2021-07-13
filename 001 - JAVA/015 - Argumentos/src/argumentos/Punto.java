package argumentos;

public class Punto {

	//variables miembro
	private float x,y;

	//constructor
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	//getters y setters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	//metodos varios
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
}
