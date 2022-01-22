import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorCount = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                factorCount++; // factorCount = factorCount + 1

            }
        }
        System.out.println(factorCount == 0 ? "Prime No" : "Not Prime No");

        scanner.close();
    }
}
