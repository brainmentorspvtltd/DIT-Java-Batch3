import java.util.ArrayList;

// SAM Interface (Single Abstract Method Interface)
@FunctionalInterface
interface Calc{
    //void disp();
    int compute(int a,int b);
}
// 1st Way
// Step- 1 Create class implement interface
class MyCalc implements Calc{
    // Step-2 Overide the interface abstract method
    // @Override
    public int compute(int x, int y){
        return x + y;
    }
    void show(){

    }
}
public class Ways {
    public static void main(String[] args) {
        ArrayList<Long> l= new ArrayList<>();
        for(int i = 1;i<=200000;i++){
            l.add((long)i);
        }
        // l.add(1);
        // l.add(2);
        // l.add(3);
        // l.add(4);
        // l.add(5);
        // Imperative Way
       /* int sum = 0;
        for(int i = 0; i<l.size(); i++){
            int val = l.get(i);
            if(val>3){
                sum+=val;
            }
        }
        System.out.println("Sum is "+sum);*/
        // declerative way
        long d = l.parallelStream().mapToLong((e)->e).filter((e)->e>10000).sum();
      //int d  = l.stream().mapToInt((e)->e).sum();
      System.out.println(d);
        // Step-3 
        // Object create and Upcasting and then call function
        // Calc c = new MyCalc(); // Upcasting
        // System.out.println(c.compute(1, 2));
        int level = 3;
        if(level == 3){

            // Lambda Style
            //Calc c2 = (a,b)-> a + b; // Implicit return 
            Calc c2 = (a,b)->{
                System.out.println("A is "+a+" and B is "+b);
                return a + b;
            };
            System.out.println(c2.compute(100, 1000));

            // Calc c2 = new Calc(){
            //     @Override
            //     public int compute(int x, int y){
            //         show();
            //         return x + y;
            //     }    
            //     void show(){
            //         System.out.println("I am Show of Anonymous class");
            //     }  
            // };
            // System.out.println(c2.compute(100, 200));
              
        }
       // c.show();
    }
}
