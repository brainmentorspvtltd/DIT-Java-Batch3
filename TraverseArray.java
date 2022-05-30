public class TraverseArray {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // Enhance for loop (Java 1.5)
        // for (int ele : arr) {
        // System.out.println(ele);
        // }
        // int arr[][] = new int[3][2];
        int arr[][] = new int[3][];
        arr[0] = new int[10];
        arr[1] = new int[20];
        arr[2] = new int[30];
        for (int a[] : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
