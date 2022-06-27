class JP {

    static int jp(int n, int k) {
        if (n == 1) {
            return 0; // 0th index
        }
        int newPos = jp(n - 1, k); // k is fix where every call reduce the circle size
        return (newPos + k) % n;
    }

    public static void main(String[] args) {
        int r = jp(5, 3);
        System.out.println(r);
    }

}