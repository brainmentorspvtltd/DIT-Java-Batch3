import java.util.ArrayList;
class Student{
    long id; // 4 Bytes
    String name; // 2 Byte for Char + Reference
    String course;
    Student(long id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
}
public class MemoryDemo {
   public static void main(String[] args) throws InterruptedException {
        Student student;
        long i = 1;
        Runtime r = Runtime.getRuntime();
        System.out.println("Processor "+r.availableProcessors());
        System.out.println("Memory Details :: Total Memory "+r.totalMemory()+" Free memory "+r.freeMemory()+" Used Memory "+(r.totalMemory() - r.freeMemory()));
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("Main Running.....");
        long startTime = System.currentTimeMillis();    
        while(i<=300000){
            //Thread.sleep(50); // 50 ms main thread will sleep
        //for(int i = 1; i<=Integer.MAX_VALUE; i++){
            student = new Student(i, "Amit", "Java ");
            list.add(student);
            i++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)+"ms");
        System.out.println("::: Memory Details :: Total Memory "+r.totalMemory()+" Free memory "+r.freeMemory()+" Used Memory "+(r.totalMemory() - r.freeMemory()));
   } 
}
