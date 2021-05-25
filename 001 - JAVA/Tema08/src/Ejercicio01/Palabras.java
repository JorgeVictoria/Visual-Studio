package Ejercicio01;

public class Palabras implements Comparable<Palabras>  {

    //variables miembro
	private String palabra;
	private int contador;
	
	//constructor
	public Palabras (String p, int c) {
		this.palabra = p;
		this.contador = c;
	}
	
	//getters
	public String getPalabra() { return this.palabra; }
	public int getContador() { return this.contador; }
	
	//setter
	public void setPalabra(String p) { this.palabra = p; }
	public void setContador(int c) { this.contador = contador+c;}

	//este metodo sirve para almacenar el total de apariciones de palabra en el aux
	public void ponContador (int c) { this.contador = c;}
	
	//metodo para comparar 2 objetos
	//En este caso recibimos 2 objetos 
	//vemos si el objeto que llama tiene una palabra con mas de 5 caracteres
	//y los comparamos con el objeto referencia
	//si tiene mas repeteciones, devolvemos 1 para que sea el nuevo objeto referencia
	//sino, pues se devuelve cero
	public int compara(Palabras p){
		//if(this == p) return 0;
		//if(p == null) return 0;
        if(this.getPalabra().length() >= 6){
            if (this.getContador() > p.getContador())return 1;
        }
        return 0;

    }

	@Override
	public int compareTo(Palabras p){
		int valor = this.getPalabra().compareTo(p.getPalabra());
		//de esta manera añadimos uno cuando usamos settree
		if (this.getPalabra().equals(p.getPalabra())) p.setContador(1);
		return valor;
	}

	@Override
	public String toString(){
		String cadena = this.palabra + " : " + this.contador;
		return cadena;
	}
    
}
