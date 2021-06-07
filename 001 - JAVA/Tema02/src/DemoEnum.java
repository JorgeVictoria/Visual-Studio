public class DemoEnum {

    enum Dia {DOM, LUN, MAR, MIE, JUE, VIE, SAB}

    enum Mes {ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC}

    public static void main(String[] args) {
        
        Dia tgif;   //variable de tipo dia
        Mes libra;  //variable de tipo mes
        tgif = Dia.VIE; //Asignar un dia de la semana
        libra = Mes.OCT;    //Asignar un mes a libra
        System.out.print("Mi signo es libra, porque he nacido ");
        System.out.println(libra);  //Muestra OCT
        System.out.println("Es el " + (libra.ordinal()+1) + " mes del año.");
        System.out.println("Ademas, " + tgif + " es el " + tgif.ordinal() + " dia de la semana"); 

        //otros metodos
        //name
        System.out.println(libra.name());

        //toString
        String dato = libra.toString();
        System.out.println(dato);

        //posicion en el array
        System.out.println(libra.ordinal());

        //compareTo
        System.out.println(libra.compareTo(Mes.JUN));

        //values
        System.out.println(Mes.values()[2]);
    }
    
}
