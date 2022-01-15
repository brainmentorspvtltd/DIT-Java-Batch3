public class Input {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        // // int a = Integer.parseInt(args[0]);
        // // int b = Integer.parseInt(args[1]);
        // int c = a + b;
        // System.out.println(c);

    }
}
