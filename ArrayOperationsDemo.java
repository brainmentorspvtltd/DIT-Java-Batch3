import java.util.Scanner;

public class ArrayOperationsDemo {
    int arr[];
    int size;

    ArrayOperationsDemo(int capacity) {
        arr = new int[capacity];
        size = 0; // current elements in array
    }

    void insert(int index, int element) {
        if (index > size) {
            throw new RuntimeException("Index can't be more than the current size");
        }
        if (size == arr.length) {
            throw new RuntimeException("Array is Full....");
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        size++;

    }

    void remove(int index) {
        if (size == 0) {
            throw new RuntimeException("Array is Empty");
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

    }

    void print() {
        System.out.println("*********** PRINT ************");
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    void update(int element, int newElement) {
        int index = search(element);
        if (index == -1) {
            System.out.println("Element Not found so can't update....");
            return;
        }
        arr[index] = newElement;
    }

    int search(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Not Found
    }

    public static void main(String[] args) {
        ArrayOperationsDemo opr = new ArrayOperationsDemo(5);
        Scanner scanner = new Scanner(System.in);
        int index;
        int element;
        int newElement;
        while (true) {
            System.out.println("1. Add New Element");
            System.out.println("2, Remove Element");
            System.out.println("3. Print Element");
            System.out.println("4. Search Element");
            System.out.println("5. Update Element");
            System.out.println("6. Exit");
            System.out.println("Enter the Choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Index ");
                    index = scanner.nextInt();
                    System.out.println("Enter the Element");
                    element = scanner.nextInt();
                    opr.insert(index, element);
                    break;
                case 2:
                    System.out.println("Enter the Index ");
                    index = scanner.nextInt();
                    opr.remove(index);
                    break;
                case 3:
                    opr.print();
                    break;
                case 4:
                    System.out.println("Enter the Element");
                    element = scanner.nextInt();
                    String msg = opr.search(element) == -1 ? "Element Not Found" : "Element found " + element;
                    System.out.println(msg);
                    break;
                case 5:
                    System.out.println("Enter the Element");
                    element = scanner.nextInt();
                    System.out.println("Enter the New Element");
                    newElement = scanner.nextInt();
                    opr.update(element, newElement);
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("WrongChoice.....");

            }

        } // Loopends

    }
}
