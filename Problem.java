public class Problem {
    public static void main(String[] args) {
        StringBuffer sql = new StringBuffer("select * from products where price = "); // len + capacity
        System.out.println(sql.length());
        System.out.println(sql.capacity());
        // sql.ensureCapacity(1000);

        sql.append(
                "Okgjkdfhgkjgjkdhdfgfdffhgjdfhkjghfjkghfdjkghjkdfghkjfdhghdjkghjkdfhgkjdfjkghdjkfhgfdhgjkdhgkjhdfjkghjkfdhgjkfdhg");
        System.out.println(sql.length());
        System.out.println(sql.capacity());
        sql.append("Ok");
        System.out.println(sql.length());
        System.out.println(sql.capacity());
        long price = 1;
        Runtime runtime = Runtime.getRuntime(); // Singleton
        System.out.println("Total " + runtime.totalMemory() + " Free " +
                runtime.freeMemory() + " Used "
                + (runtime.totalMemory() - runtime.freeMemory()));
        long startTime = System.currentTimeMillis();
        for (price = 1; price <= 100000; price++) {
            // sql = sql + price;
            sql.append(price);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken " + (endTime - startTime) + " ms");
        System.out.println("Total " + runtime.totalMemory() + " Free " + runtime.freeMemory() + " Used "
                + (runtime.totalMemory() - runtime.freeMemory()));
    }
}
