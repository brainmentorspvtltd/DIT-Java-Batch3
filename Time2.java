public class Time2 {
    public static void main(String[] args) {
        // Sibling Loops
        int n = 100;
        // for (int i = 1; i <= n; i++) {

        // }
        // for (int i = 1; i <= n; i = i * 2) {

        // }
        // for (int i = 1; i <= 200; i++) {

        // }
        // Nested Loops
        for (int i = 1; i <= n; i++) { // N
            for (int j = 1; j <= n; j = j * 2) { // Log N

            }
        }
        // TC N* LogN = 0(N*LogN)

        for (int i = 1; i <= n; i++) { // N
            for (int j = 1; j <= n; j = j++) { // N

            }
        }
        // TC N * N

    }
}
