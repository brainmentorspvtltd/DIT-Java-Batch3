class P{
    int a = 1;
    void show(){
        System.out.println("P Show");
    }
}
class C extends P{
    int a = 2;
    @Override
    void show(){
        System.out.println("C Show");
    }

}

abstract class demo{
    int a = 10;
    demo(){
        a = 20;
    }
    //abstract final void disp(); // Compile Fail
}

public class D {
    public static void main(String[] args) {
        //C c = new C();
        P c = new C(); // Upcasting
        System.out.println(c.a); // Variable Access
        c.show(); // Fn Access
    }
}
