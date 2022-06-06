import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementOnRight {
    public static void main(String[] args) {
        int arr[] = { 20, 7, 5, 14, 16 };
        int output[] = new int[arr.length]; // default all are fill with 0
        Arrays.fill(output, -1); // all values fill with -1
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Store 0th index
        for (int i = 1; i < arr.length; i++) {
            int index = stack.peek(); // get the top element of stack
            if (arr[index] >= arr[i]) {
                stack.push(i);
            } else {
                // Some Greater element found so keep pop the element till u found bigger
                // element
                while (arr[stack.peek()] < arr[i]) {
                    output[stack.peek()] = arr[i];
                    stack.pop();
                }
                stack.push(i);

            }
        }
        for (int element : output) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
