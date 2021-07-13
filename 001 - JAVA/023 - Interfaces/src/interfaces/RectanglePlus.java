package interfaces;

import java.awt.Point;

public class RectanglePlus implements MyInterface {
	
	//variables locales
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	//cosntructores
	public RectanglePlus() {
		origin = new Point(0, 0);
	}
	
	public RectanglePlus(Point p) {
		origin = p;
	}
	
	public RectanglePlus(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}
	
	public RectanglePlus(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}
	
	//metodo para mover el rectangulo
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}
	
	//metodo para calcular el area de un rectangulo
	public int getArea() { return width * height; }
	
	//metodo requerido para implementar
	//la interfaz MyInterface
	public int isLargerThan(Relatable other) {
		RectanglePlus otherRectangle = (RectanglePlus)other;	//casting
		if(this.getArea() < otherRectangle.getArea()) return -1;
		else if(this.getArea() < otherRectangle.getArea()) return 1;
		else return 0;
	}
	
	
	public void print(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "RectanglePlus [width=" + width + ", height=" + height + ", origin=" + origin + "]";
	}
	
	

}
