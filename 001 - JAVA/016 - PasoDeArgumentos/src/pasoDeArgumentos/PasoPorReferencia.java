package pasoDeArgumentos;

public class PasoPorReferencia {

	public static void main(String[] args) {
		
		//creamos un circulo
		Circulo circulo = new Circulo(2,3);
		
		//imprimimos el circulo
		System.out.println(circulo);
		
		//podemos crear una copia y el circulo original no queda afectado
		//Circulo copiaCirculo = new Circulo(circulo);
		
		//invocamos a un metodo al que le pasamos el objeto circulo y 2 puntos nuevos
		moverCirculo(circulo,23,57);
		//moverCirculo(copiaCirculo,23,57);
		
		//volvemos a imprimir el circulo. Habran cambiado los datos. Con objetos, pasar copia
		System.out.println(circulo);
		//System.out.println(copiaCirculo);

	}

	private static void moverCirculo(Circulo circulo, int i, int j) {
		
		circulo.setX(circulo.getX() + i);
		circulo.setY(circulo.getY() + j);
		
		circulo = new Circulo(0, 0); //esto no afecta a la referencia
		
	}

}
