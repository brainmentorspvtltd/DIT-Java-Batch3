public class SpaceComp {

    static void approach2() {
        int arr[] = { 10, 20, 30, 40, 60, 70, 50 };
        int i = 0; // first
        int j = arr.length - 1; // last
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Reverse an Array
        approach2();
        // int arr[] = { 10, 20, 30, 40, 60, 70, 50 };
        // // Auxlilary space O(N)
        // // Instead of O(N) Space build in O(1)
        // // TC O(N)
        // int aux[] = new int[arr.length]; // 7 Element with 0 value
        // // Approach -1 Pick the Last element from the array and store this last in a
        // new
        // // array on first place.
        // for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
        // aux[j] = arr[i]; // Last goes in first
        // }
        // arr = aux;
        // for (int element : arr) {
        // System.out.println(element);
        // // }
    }
}
