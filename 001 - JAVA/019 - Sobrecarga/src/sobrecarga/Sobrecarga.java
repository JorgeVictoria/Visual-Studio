package sobrecarga;

public class Sobrecarga {

	public static void main(String[] args) {
		
		//creamos un artista
		Artista artista = new Artista();
		
		//invocamos los metodos del artista
		artista.dibuja("Hola");
		artista.dibuja(7);
		artista.dibuja(7, 8.9);
		
		
		//creamos personas
		Persona perso1 = new Persona();
		Persona perso2 = new Persona("Jorge","Victoria");
		Persona perso3 = new Persona("Jorge","Victoria", 45,172, 90);
		
		//imprimimos los datos de las personas
		System.out.println(perso1);
		System.out.println(perso2);
		System.out.println(perso3);

	}

}
