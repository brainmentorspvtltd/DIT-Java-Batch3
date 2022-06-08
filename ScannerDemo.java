import java.io.File;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Keyboard
        // Scanner scanner = new Scanner(new
        // File("/Users/amitsrivastava/Documents/dsa-june/strings/ReverseWords.java"));
        // while (scanner.hasNextLine()) {
        // System.out.println(scanner.nextLine()); // \n new line
        // }
        // while (scanner.hasNext()) {
        // System.out.println(scanner.next()); // space
        // }
        System.out.println("Enter the Age");
        int age = scanner.nextInt(); // 21 \n
        System.out.println("Enter the Name");
        scanner.nextLine();
        String name = scanner.nextLine(); // \n
        System.out.println("Age  " + age + " Name " + name);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the City");
        System.out.println(s.next());
        s.close(); // close at end
        scanner.close(); // close System.in
    }
}
