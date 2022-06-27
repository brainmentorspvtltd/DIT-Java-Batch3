
public class Fibo {
    static int call = 0;
    static int call2 = 0;

    static int fiboRec(int n) {
        // Termination Case
        if (n == 0 || n == 1) {
            return n;
        }
        call++;
        int secondTerm = fiboRec(n - 1); // Small Problem
        int firstTerm = fiboRec(n - 2);
        int result = firstTerm + secondTerm;
        return result;
    }

    static int tabulation(int n) {
        int cache[] = new int[n + 1];
        cache[0] = 0; // first term
        cache[1] = 1; // second term
        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    static int fiboMemo(int n, int[] cache) {
        // Termination Case
        if (n == 0 || n == 1) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        call2++;

        int secondTerm = fiboMemo(n - 1, cache); // Small Problem
        int firstTerm = fiboMemo(n - 2, cache);
        int result = firstTerm + secondTerm;
        // Store the Computed result

        cache[n] = result;
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(fiboRec(5));
        // System.out.println("rec call " + call);
        // int n = 5;
        // int cache[] = new int[n + 1];
        // System.out.println("Memo Call result " + (fiboMemo(n, cache)));
        // System.out.println("Memo Call " + call2);
        System.out.println(tabulation(8));
    }
}
