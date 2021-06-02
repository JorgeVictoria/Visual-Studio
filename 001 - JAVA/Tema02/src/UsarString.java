public class UsarString {

    public static void main(String[] args) {
        
        String s1 = "Jorge";
        String s2 = "Victoria";
        String s3 = "Andreu";
        String s4 = "Hola              ";

        System.out.println("metodo equals");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Jorge"));
        System.out.println("--------------");

        System.out.println("metodo equalsignorecase");
        System.out.println(s1.equalsIgnoreCase("jorge"));
        System.out.println("--------------");

        System.out.println("metodo length");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println("--------------");

        System.out.println("metodo charAt");
        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(1));
        System.out.println(s3.charAt(2));
        System.out.println("--------------");

        System.out.println("metodo substring");
        System.out.println(s1.substring(2, 4));
        System.out.println(s2.substring(3));
        System.out.println("--------------");

        System.out.println("metodo indexOf");
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.indexOf("h"));
        System.out.println(s2.indexOf("i", 3));
        System.out.println("--------------");

        System.out.println("metodo lastIndexOf");
        System.out.println(s2.lastIndexOf("i"));
        System.out.println(s2.lastIndexOf("o", s2.length()-1));
        System.out.println(s2.lastIndexOf("j"));
        System.out.println("--------------");

        System.out.println("metodo compareTo");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase("jorge"));
        System.out.println("--------------");

        System.out.println("metodos uppercase y lowercase");
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("--------------");

        System.out.println("metodo trim");
        System.out.print(s4);
        System.out.println(s1);
        System.out.print(s4.trim() + " ");
        System.out.println(s1);
        System.out.println("--------------");

        System.out.println("metodo matches");
        System.out.println("12345678".matches("\\d{8}"));
        System.out.println("12345678".matches("\\d{9}"));
        System.out.println("--------------");
    }
    
}
