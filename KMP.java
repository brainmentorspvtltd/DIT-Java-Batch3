public class KMP {

    static int generateLPS(String str, int stringLen) {
        // Suffix value get
        for (int len = stringLen - 1; len > 0; len--) {
            // Prefix Value Get
            boolean isMatch = true;
            for (int i = 0; i < len; i++) {
                System.out.println("I Prefix " + i + " Prefix Char " + str.charAt(i) + " Suffix "
                        + (stringLen - len + i) + " Suffix Char  " + str.charAt(stringLen - len + i));
                if (str.charAt(i) != str.charAt(stringLen - len + i)) {
                    isMatch = false;
                }
            }
            if (isMatch) {
                return len;
            }
        }
        // No Char Match return 0 length
        return 0; // return length of Common Char Prefix , Suffix
    }

    static void better(String str, int[] lps) {
        int strLen = str.length();
        int len = 0;
        lps[0] = 0; // first prefix is always prefix , so prefix and suffix not match so length is 0
        int i = 1;// start from 1st index (2nd Char)
        while (i < strLen) {
            char prefix = str.charAt(len); // start 0
            char suffix = str.charAt(i); // next to the length
            if (prefix == suffix) {
                len++;
                lps[i] = len;
                i++; // move to the next char
            } else {
                // prefix not match with suffix
                if (len == 0) {
                    // first char
                    lps[i] = 0; // set 0 length
                    i++; // move to the next character
                } else {
                    len = lps[len - 1]; // move the previous index of lps array which consist of last matching prefix
                                        // length
                }

            }
        }
    }

    public static void main(String[] args) {
        String str = "ababc";
        int lps[] = new int[str.length()];
        // Old Code
        // for (int i = 0; i < lps.length; i++) {
        // lps[i] = generateLPS(str, i + 1);
        // }
        // New Code
        better(str, lps);
        for (int e : lps) {
            System.out.print(e + " ");
        }
        System.out.println();

    }
}
