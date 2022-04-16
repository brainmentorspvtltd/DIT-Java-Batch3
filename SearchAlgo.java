import java.util.EnumSet;

import javax.swing.text.AbstractDocument.ElementEdit;

public class SearchAlgo {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 11, 9, 1 };
        int search = 10;
        if (arr.length == 0) {
            return;
        }
        if (arr[0] == search) {
            System.out.println("Found in Start");
            return;
        }
        for (int element : arr) {
            if (element == search) {
                System.out.println("Found....");
                return; // exit from a function
            }
        }
        System.out.println("Not Found....");
    }
}
