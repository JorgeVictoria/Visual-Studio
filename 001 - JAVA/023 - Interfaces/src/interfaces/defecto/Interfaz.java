package interfaces.defecto;

public interface Interfaz {
	
	public void metodo();	//metodo abstracto
	
	//si una clase no quiere meter cuerpo al metodo, usa este cuerpo por defecto
	default public void metodoPorDefecto() { System.out.println("Este es uno de los nuevos metodos por defecto"); }
	
	public static void metodoEstatico() { System.out.println("Metodo estatico en una interfaz"); }

}
