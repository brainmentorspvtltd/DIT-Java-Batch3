public class SubArraySum {
    public static void main(String[] args) {
        // Count Sub Array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        } // 1 + 2 + 3
        System.out.println(sum);
        // 6 + 4 -1
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            System.out.println(sum);
        }
    }
}
