// final - freeze thing / which can't be change
final class H{ // this class can't be change because it can't be inherit

}
class H1{
    final void show(){ // this method can't be change it can't be override

    }
}
class H2{
    final int x,y; // this assign only once and can't change further
    H2(){
        x = 10; y = 20; // final instance variable only assign using constructor 
        // constructor call once for object life cycle.
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        final int MAX = 100;  //which can't be change
        // It is become a constant
    }   
}
