import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {
        System.out.println("Nth Fibo");
        long phone = new Scanner(System.in).nextLong();
        System.out.println(phone);
        int n = new Scanner(System.in).nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }
    }
}