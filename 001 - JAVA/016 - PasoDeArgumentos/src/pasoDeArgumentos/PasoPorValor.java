package pasoDeArgumentos;

public class PasoPorValor {

	public static void main(String[] args) {
		
		int x = 3;
		
		pasoPorValor(x);
		
		System.out.println("Despues de invocar el metodo, x = " + x);

	}
	
	public static void pasoPorValor(int p) {
		
		System.out.println("Dentro del metodo. p(que recibe el valor de x) = " + p);
		
		p = 10;
		
	}

}
