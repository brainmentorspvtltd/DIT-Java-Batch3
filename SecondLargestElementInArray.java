public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 15, 11, 12, 20 };
        int max = -1;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
            if (arr[i] != max) {
                // Checking Dup
                // make sure current element is not the first largest
                if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println("First " + max + " Second " + secondLargest);
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println("First Largest " + max);
        // int secondLargest = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] != max) {
        // if (arr[i] > secondLargest) {
        // secondLargest = arr[i];
        // }
        // }
        // }
        // System.out.println("Second Largest " + secondLargest);
    }
}
