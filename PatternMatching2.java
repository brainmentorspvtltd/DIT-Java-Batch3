package strings;

public class PatternMatching2 {
    public static void main(String[] args) {

        String str = "ABCWABCDABDABC";
        String pattern = "ABCD";
        int n = str.length();
        int p = pattern.length();
        for (int i = 0; i <= (n - p);) {
            int j;
            for (j = 0; j < p; j++) {
                if (pattern.charAt(j) != str.charAt(i + j)) {
                    break; // if pattern not match then exist
                }
            } // jth loop ends
            if (j == p) {
                System.out.println("Pattern Found " + i);
                // return ; // for first found
            }
            if (j == 0) {
                i++; // str move to the next character
            } else {
                i = i + j; // Jump to the jth index from where pattern not match
            }

        }
    }
}
