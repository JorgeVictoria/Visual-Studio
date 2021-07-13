package arrays;

public class ManejoArrays03 {

	public static void main(String[] args) {
		
		//2 arrays con nombres varios, para crear personas al azar
		String[] nombres = {"Jose", "Antonio", "Martin", "Luis", "Maria", "Leticia", "Luisa"};
		String[] apellidos = {"Perez", "Gomez", "Lopez", "Garcia", "Muñoz", "Martinez"};
		
		//creamos el array para almacenar personas
		Persona[] personas = new Persona[5];
		
		//creamos los objetos Persona
		for(int i = 0; i < personas.length; i++) {
			personas[i] = new Persona();
			personas[i].setNombre(nombres[(int)(Math.random()*nombres.length)]);
			personas[i].setApellido1(apellidos[(int)(Math.random()*apellidos.length)]);
			personas[i].setApellido2(apellidos[(int)(Math.random()*apellidos.length)]);
		}
		
		//mostramos las personas
		for(int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}

	}

}
