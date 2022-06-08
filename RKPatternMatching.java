public class RKPatternMatching {
    public static void main(String[] args) {
        /*
         * 1. Slide the Pattern One By One
         * 2. Do the Better Hash
         * 3. If Hash are same then compare the characters
         * 4. Repeat the 1st Step Again till string exhaust
         */
        String str = "ABCDABCWABCE";
        String pattern = "ABCD";
        int n = str.length();
        int p = pattern.length();
        int d = pattern.length();
        int q = 13; // Prime No / Large Prime No (If Hash is coming Negative)
        int stringHash = 0;
        int patternHash = 0;
        // Compute the Pattern Hash First
        for (int i = 0; i < p; i++) {
            patternHash = (patternHash * d + (pattern.charAt(i))) % q;
            stringHash = (stringHash * d + (str.charAt(i))) % q;
        }
        for (int i = 0; i <= n - p; i++) {
            if (patternHash == stringHash) {
                // compare the pattern with string values one by one
                int j;
                for (j = 0; j < p; j++) {
                    if (pattern.charAt(j) != str.charAt(i + j)) {
                        break;
                    }
                } // j loop ends (Pattern loop ends)
                if (j == p) {
                    System.out.println("Pattern Match " + i);
                }
                // recompute str Hash only
                if (i < n - p) {
                    stringHash = ((stringHash * d + str.charAt(i + p)) - str.charAt(i)) % q;
                    if (stringHash < 0) {
                        stringHash = stringHash + q;
                    }
                }

            }
        }

    }

}
