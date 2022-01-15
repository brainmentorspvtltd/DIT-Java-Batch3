public class Pool {
    public static void main(String[] args) {
        String a = "Hello".intern();
        String b = "Hello".intern();
        String c = new String("Hello").intern();
        System.out.println(a == b);
        System.out.println(a == c);
    }
}
