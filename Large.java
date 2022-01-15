import java.math.BigInteger;

public class Large {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("34345364565645645645645654645645645");
        BigInteger d = new BigInteger("35453453453453534543543534546456757");
        BigInteger c = b.add(d);
        System.out.println(c);
        int e = 100; // Value type

        Integer e2 = 100; // Ref Type

        float w = e2.floatValue(); // Easy TypeCasting
        int v = Integer.parseInt("10000"); // string to int
        Float ww = 10.20f;
        Float w2 = new Float(10.20f);
        // Integer Pool 1 BYte Range Value
        // -128 to 127
        Integer i = 128;
        Integer j = 128;
        Integer k = new Integer(128);
        System.out.println(i == j); // true
        System.out.println(i == k); // false

    }
}
