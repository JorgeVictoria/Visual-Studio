package bicicleta;

public class Estaticos {

	public static void main(String[] args) {
		
		Bicicleta bici1	= new Bicicleta(21, 27, 0);
		Bicicleta bici2 = new Bicicleta(18, 24, 0);
		
		System.out.println(bici1);
		System.out.println(bici2);
		
		//lo habitual es acceder a los atributos estaticos a traves de la clase, no de la instancia
		System.out.println(Bicicleta.getNumeroDeBicicletas() + " bicicletas.");

	}

}
