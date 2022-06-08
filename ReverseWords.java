
public class ReverseWords {
    public static void main(String[] args) {
        String word = "a good  example";
        String words[] = word.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
