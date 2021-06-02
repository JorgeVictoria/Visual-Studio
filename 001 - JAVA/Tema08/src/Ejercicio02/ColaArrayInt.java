package Ejercicio02;

public class ColaArrayInt implements ColasInt {
    //variables
    private static boolean flag = false; //para controlar la impresion de la linea

    //variables miembro
    private static final int LONGITUD_POR_DEFECTO = 10;
    private int maxLongitud;        //Tamaño por defecto
    private int cabeza;             //indice del primero de la cola
    private int fin;                //indice del ultimo de la cola
    private int[] datos;            //array que almacena elementos

    //constructores
    public ColaArrayInt() { this(LONGITUD_POR_DEFECTO);}

    public ColaArrayInt(int max) {
        this.maxLongitud = max + 1;  //un espacio extra
        this.fin = 0;
        this.cabeza = 1;
        datos = new int[maxLongitud];
    }

    //getters
    public int getFin() {return this.fin;}
    public int getCabeza() {return this.cabeza;}
    public int getMaxLongitud() {return maxLongitud;}

    //metodos
    public void vaciar() {
        this.fin = 0;
        this.cabeza = 1;
        flag = false;
    }

    /** Añadir a la cola e */
    public boolean encolar(int e) {
        //si no se cumple esta condicion, la cola esta llena
        if ((this.fin + 2) % this.maxLongitud != this.cabeza){
            this.fin = (this.fin + 1) % this.maxLongitud; // Incremento circular
            this.datos[this.fin] = e;
            flag = true;
            return true;
        }
        return false;
   }

   /** Eliminar y devolver el primer elemento (cabeza) */
    public int desencolar() {
        //si no se cumple, la cola esta vacia
        if (this.longitud() != 0){
            int e = this.datos[this.cabeza];
            this.cabeza = (this.cabeza + 1) % this.maxLongitud; // Incremento Circular
            return e;
        }
        return 0;
   }

   /** @return primer valor */
    public int primero() {
        //sino se cumple: "La cola está vacía";
        if(this.longitud() != 0) return this.datos[this.cabeza];
        return 0;
   }

   /** @return Cantidad de elementos en la cola */
    public int longitud(){ 
        return ((this.fin + this.maxLongitud) - this.cabeza + 1) % this.maxLongitud;
   }

  @Override
  public String toString(){
      
    String cadena="";
    
    if (flag == true){

        //mientras la posicion de cabeza no sea mayor que la posicion del fin de la cola
        if (cabeza <= fin){
            for(int i = cabeza; i <= fin; i++){
                cadena = cadena + datos[i] + " ";
            }
        }

        //como es una cola circular se puede dar el caso de que el fin de la cola
        //sea una posicion menor que el inicio de la cola
        //debemos leer desde el inicio de la cola hasta el final del array
        //y posteriormente desde el incicio del array hasta el fin de la colas
        else {
            for(int i = cabeza; i < maxLongitud; i++){
                cadena = cadena + datos[i] + " ";
            }
            for (int i = 0; i <= fin; i++){
                cadena = cadena + datos[i] + " ";
            }
        }
    }
    return cadena;

    
  }

}
