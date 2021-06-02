public class UsarMath {

    public static void main(String[] args) {
        
        //variables locales
        long tiempoInicio;  //t cuando comienza en milisegundos
        long tiempoFinal;   //t cuando acaba, en ms
        double tiempo;      //diferencia de tiempo en segundos
        double ancho, alto, hipotenusa; //lados del triangulo

        tiempoInicio = System.currentTimeMillis();
        ancho = 42.0;
        alto = 17.0;
        hipotenusa = Math.sqrt(ancho * ancho + alto * alto);
        
        System.out.print("Hipotenusa de triangulo de catetos de 42 y 17");
        System.out.println(hipotenusa);
        System.out.println("\nEn matematicas, sin(x) * sin(x) + " + "cos(x) * cos(x) -1 debe ser 0.");
        System.out.println("Lo comprobamos para x=1:");
        System.out.print("sin(1) * sin(1) + cos(1) * cos(1) - 1 es ");
        System.out.println(Math.sin(1) * Math.sin(1) + Math.cos(1) * Math.cos(1) -1 );
        System.out.print("\nAhora un numero aleatorio: ");
        System.out.println(Math.random());
        System.out.print("El valor de pi es ");
        System.out.println(Math.PI);

        tiempoFinal = System.currentTimeMillis();
        tiempo = (tiempoFinal - tiempoInicio) / 1000.0;

        System.out.print("\nEl tiempo de ejecucion en segundos ha sido: ");
        System.out.println(tiempo);
        
    }
    
}
