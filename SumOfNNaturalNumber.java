// PS : Range 5
// Output 15
// Explain 1 + 2 + 3 + 4 + 5
class Sum {
    void approach1() {
        int range = 5;
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    void approch2() {
        int n = 5;// Math Formula - N Natural Number Sum
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    void approach3() {
        int n = 5;
        int sum = 0; // counting
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

    }
}