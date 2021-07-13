package argumentos;

import java.util.Arrays;

public class Rectangulo {
	
	//variables miembro
	private Punto[] puntos;
	
	//constructores
	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		puntos = new Punto[] {p1,p2,p3,p4};
	}

	public Rectangulo(Punto[] puntos) {
		this.puntos = puntos;
	}
	
	//getters y setters
	public Punto[] getPuntos() {
		return puntos;
	}

	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}

	//metodos varios
	@Override
	public String toString() {
		return "Rectangulo [puntos=" + Arrays.toString(puntos) + "]";
	}
	
}
