public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 2, 2, 3, 1, 2, 1, 3, 3, 1, 2, 2, 2 };
        // int arr[] = { 2, 4, 2, 1, 2, 1, 1, 1, 3 };
        int count = 0;
        int majorityElement = 0;
        int majCount = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majorityElement = arr[i];
            }
            if (majorityElement == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int e : arr) {
            if (e == majorityElement) {
                count++;
            }
        }
        System.out.println(count > majCount ? "Majority Element " + majorityElement
                : " No Majority Element ");

    }
}
