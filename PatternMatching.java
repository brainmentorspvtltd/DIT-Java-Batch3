public class PatternMatching {
    public static void main(String[] args) {
        String str = "BBBBB";
        String pattern = "BBB";
        // String str = "ABCWABCDABDABC";
        // String pattern = "ABCD";
        int n = str.length();
        int p = pattern.length();
        for (int i = 0; i <= (n - p); i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (pattern.charAt(j) != str.charAt(i + j)) {
                    break; // if pattern not match then exist
                }
            } // jth loop ends
            if (j == p) {
                System.out.println("Pattern Found " + i);
            }

        }
    }
}
