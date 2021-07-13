package argumentos;

public class Principal {

	public static void main(String[] args) {
		
		//creamos los puntos
		Punto[] misPuntos = {new Punto(25,25), new Punto(25,35), new Punto(20,5), new Punto(20,15)};
		
		//creamos el rectangulo
		Rectangulo rectangulo = new Rectangulo(new Punto(5,5), new Punto(5,15), new Punto(20,5), new Punto(20,15));
		//Rectangulo rectangulo = new Rectangulo(p1,p2,p3,p4); si creasemos los puntos uno a uno
		
		//imprimimos el rectangulo
		System.out.println(rectangulo);
		
		//modificamos los puntos haciendo uso del setter
		rectangulo.setPuntos(misPuntos);
		
		//volvemos a imprimir el rectangulo
		System.out.println(rectangulo);

	}

}
