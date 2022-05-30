class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        System.out.println(obj);
        System.out.println(obj.toString());
        int arr[] = new int[10]; // All fill with zero
        int[] arr2 = new int[20];
        int e = 100;
        int[] arr3 = { 10, 20, 30, 40, e };
        int[] arr4 = new int[] { 10, 20, 30, 40, 50 };
        System.out.println(arr);
        System.out.println(arr3);
        System.out.println(arr.length);
        double r[] = new double[10];
        System.out.println(r);
        int[][] t = new int[3][3];
        System.out.println(t);
    }
}