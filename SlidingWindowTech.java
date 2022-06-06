public class SlidingWindowTech {
    public static void main(String[] args) {
        // Count Sub Array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int subArrayCount = 0;
        for (int i = 0; i < k; i++) {
            subArrayCount++;
        }
        System.out.println(subArrayCount);
        for (int i = k; i <= arr.length - k; i++) {
            subArrayCount++;
        }
        System.out.println(subArrayCount);
    }
}
