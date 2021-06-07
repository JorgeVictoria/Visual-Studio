import java.math.BigInteger;

public class UsarBigInteger {

    public static void main(String[] args) {
        
        //crear un objeto biginteger
        BigInteger test = new BigInteger("1234567890");

        //ONE es una constante de la clase
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.TEN;
        BigInteger o = BigInteger.TWO;
        BigInteger p = BigInteger.ZERO;
        BigInteger q = BigInteger.valueOf(-6000);
        BigInteger r = BigInteger.valueOf(511);

        System.out.println(n + " , " + m + " , " + o + " , " + p);

        //suma
        n = n.add(BigInteger.valueOf(9));
        System.out.println(n);

        //resta
        n = n.subtract(BigInteger.valueOf(4));
        System.out.println(n);

        //producto
        n = n.multiply(BigInteger.valueOf(10));
        System.out.println(n);

        //division
        n = n.divide(BigInteger.valueOf(2));
        System.out.println(n);

        //valor absoluto
        System.out.println(q.abs());

        //and
        System.out.println(n.and(m));

        //compareTo
        System.out.println(n.compareTo(m));

        //valor primitivo del bigInteger
        int num = n.intValue();
        System.out.println(num);

        //mod
        System.out.println(n.mod(m));

        //toByteArray

        byte[] array = r.toByteArray();
        System.out.println(array.length);
        System.out.println(array[0]);

        array= test.toByteArray();
        System.out.println(array.length);




    }
    
}
