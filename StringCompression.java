import java.util.HashMap;

public class StringCompression {

    public static int compress(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char singleChar : chars) {
            if (map.get(singleChar) == null) {
                map.put(singleChar, 1);
            } else {
                int count = map.get(singleChar);
                count = count + 1;
                map.put(singleChar, count);
            }
        }
        System.out.println(map);
        return map.size() * 2;
    }

    public static void main(String[] args) {
        char chars[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int e = compress(chars);
        System.out.println(e);
    }
}
