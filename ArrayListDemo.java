import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // Vector<Integer> list = new Vector<>();
        ArrayList<Integer> list = new ArrayList<>(2);
        System.out.println(list.size());
        // list.addElement(9992);
        list.add(100);
        list.add(10);
        list.add(0, 999);
        list.add(888);
        System.out.println(list.size());

    }
}
