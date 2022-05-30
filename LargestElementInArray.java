public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 10, 90, 20, 70, 100, 60, 40 };

        int max = arr[0]; // 10
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Value is " + max);

        // boolean isLargest = false;
        // // Traverse the Elements one by one
        // for (int i = 0; i < arr.length; i++) {
        // isLargest = true;
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // isLargest = false;
        // break;

        // }
        // } // jth loop end
        // if (isLargest) {
        // System.out.println("Largest Element " + arr[i]);
        // return;
        // }
        // }
    }
}
