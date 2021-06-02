public class prueba {

    public static void main(String[] args) {
        
        double r1 = Math.random();
        double r2 = Math.random();

        System.out.println(r1);
        System.out.println(r2);

        double z1 = Math.sqrt(-2*Math.log(r1))*Math.sin(2*Math.PI*r2);
        System.out.println(z1);
        double n1 = z1*10+5.8;
        System.out.println(n1);

        int tiempoBusqueda = (int)n1;
        System.out.println(tiempoBusqueda);
        int tiempoCola = (int)(tiempoBusqueda * (Math.random() * 2));
        System.out.println(tiempoCola);

    }
    
}
