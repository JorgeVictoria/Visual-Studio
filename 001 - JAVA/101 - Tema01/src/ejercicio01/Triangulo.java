/**
 * 
 */
package ejercicio01;

/**
 * @author jvand
 *
 */
public class Triangulo {
	
	//variables miembro
	private double base;	//base del triangulo
	private double altura;	//altura del triangulo
	private double area;	//area del triangulo
	
	//constructor
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = (this.getBase()*this.getAltura())/2;
	}

	//otros metodos
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", area=" + area + "]";
	}
	
}
