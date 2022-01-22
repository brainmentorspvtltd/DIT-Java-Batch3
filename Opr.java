public class Opr {
    public static void main(String[] args) {
        byte x = 10;
        byte y = 20;
        // byte z = (byte) (x + y);
        byte z = 0;
        z += x;
        z += y;
        y += x; // y = x + y;
        System.out.println(z);
    }
}
