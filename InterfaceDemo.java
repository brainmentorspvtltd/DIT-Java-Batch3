import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.*;

// 100 % ABSTRACT  (ALL ARE ABSTRACT METHODS + CONSTANTS)
interface DBOperations{ // abstract interface DBOperations
 int MAX = 100; // public static final int MAX = 100;   
  boolean create(String userid, String password); // public abstract boolean create (String userid, String password)
 List read();   // public abstract List read();
 // Java 8 
 public default void logDBTime(){
     show();
    System.out.println("DB Time "+new Date());
}
// Java 9 
    private  void show(){
        System.out.println("I am the Show Fn of DBOperations");

    }
    // Java 8 
    public static void disp(){
        System.out.println("I am Static in INterface");
    }
}
// Partial Implementation
 abstract class PosGres implements DBOperations{
    @Override
 public boolean create(String userid, String password){
    return true;
 }
 
}
interface AuthOperations{
    int MAX = 200;
    void login();
    boolean create(String userid, String password);

}
interface MixOperations extends DBOperations , AuthOperations{
    int MAX = 300;
}
class H2 implements MixOperations{

    @Override
    public boolean create(String userid, String password) {
        // TODO Auto-generated method stub
        System.out.println(DBOperations.MAX + AuthOperations.MAX + MixOperations.MAX);
        return false;
    }

    @Override
    public List read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void login() {
        // TODO Auto-generated method stub
        
    }
    
}
class PosGresNew extends PosGres{

    @Override
    public List read() {
        // TODO Auto-generated method stub
        return null;
    }

}
class Db{

}
// Fully Implementation
//ERROR class MySQL implements DBOperations, AuthOperations extends Db{
class MySQL extends Db implements DBOperations, AuthOperations{
    @Override
    public boolean create(String userid, String password){
        System.out.println("Added in MySQL DB");
        return true;
    }
    @Override
    public List read(){
        return new ArrayList();
    }
    @Override
    public void login() {
        // TODO Auto-generated method stub
        
    }
}
class Oracle implements DBOperations{

    @Override
    public boolean create(String userid, String password) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List read() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
/*class W implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}*/

class W2 extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
            WindowAdapter w ;
            WindowListener l;  
            DBOperations.disp();  
            // H2 h2 = new H2();
            // h2.create("Amit", "11111");
            // h2.logDBTime();
    }
}
