class Emp{ // class Emp extends Object
    int id;
    String name;
    Emp(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Emp Born...");
    }
    void print(){
        System.out.println("Id "+id+" name "+name);
    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("Good Bye Emp...");
    }
}
public class GC {
    public static void main(String[] args) {
        Emp emp = new Emp(1001, "ram");
        //emp.print();
        
        int x = 10;
        int y = 20;
        
        //System.out.println(" Emp is null now...");
        emp = null;
        System.gc(); // Request to GC to Run....
        x++;
        y++;
        
        for(int i = 1; i<=5; i++){
            System.out.println("I is "+i);
        }
        //System.out.println("main Ends..");

    }
}
