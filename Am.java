interface X{
    void show(); // public abstract void show();
    default void disp(){
        System.out.println("X Disp");
    }
}
interface Y{
    void show(); // public abstract void show();
    default void disp(){
        System.out.println("Y Disp");
    }
    default strictfp void test(){
        float w = 10.2f;
        double w2 = 777.22;
    }
}
interface Z extends X,Y{
    @Override
    default void disp(){
        X.super.disp();
        Y.super.disp();
        System.out.println("Z Disp");
    }
}
class Z1 implements Z{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        
    }
    
}
public class Am {
    public static void main(String[] args) {
            Z1 obj = new Z1();
            obj.disp();
    }
}
