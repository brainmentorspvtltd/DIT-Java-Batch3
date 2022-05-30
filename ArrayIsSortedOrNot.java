public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = { 10, 6, 100, 20, 90, 88 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // System.out.println("Not Sorted Array...");
        // return;
        // }
        // }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("Not a Sorted Array");
                return;
            }
        }
        System.out.println("Sorted Array...");

    }
}
