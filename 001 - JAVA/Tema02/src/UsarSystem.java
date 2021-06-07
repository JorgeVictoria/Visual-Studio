
public class UsarSystem {

    public static void main(String[] args) {
        //variables locales
        int[] numeros = {1,2,3,4,5,6};
        int[] numeros2 = new int[4];
        
        //podemos recoger propiedades
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.specification.version"));

        //para copiar arrays
        System.arraycopy(numeros, 0, numeros2, 0, 3);
        System.out.println(numeros2[0] + ", " + numeros2[1] + ", " + numeros2[2]);

        //nos devueleve el tiempo en milisegundos
        System.out.println(System.currentTimeMillis());

        //nos devuelve el tiempo en nanosegundos
        System.out.println((System.nanoTime()));

        //para acabar un programa
        System.exit(0);

    }
    
}
