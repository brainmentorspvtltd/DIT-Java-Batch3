import java.util.ResourceBundle;

interface IProducer{
    void show();
    void input();
}
class EnhanceProducer implements IProducer{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Enhance Producer Show");
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        System.out.println("Enhance Producer input");
        
    }
    
}
class Producer implements IProducer{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Producer Show");
        
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        System.out.println("Producer Input");
        
    }
    public void notExpose1(){
        System.err.println("Not Expose 1");
    }
    public void notExpose2(){
        System.err.println("Not Expose 2");

    }
    public void notExpose3(){
        System.err.println("Not Expose 3");
    }

}
interface Factory{
    public static final ResourceBundle rb  = ResourceBundle.getBundle("config");
    public static IProducer getInstance(){
       // First read the property file
       Object object  = null;
       String className = rb.getString("classname");
       try{
       object = Class.forName(className).getDeclaredConstructor().newInstance();
       }
       catch(Exception e){
           System.out.println("Class Not Found "+e);
       }
       return (IProducer)object;
    //    if(className.equals("EnhanceProducer")){
    //        return new EnhanceProducer();
    //    }
        // return new Producer();
        //return new EnhanceProducer();
    }
}
class ConsumerA{
    void call(){
        IProducer p = Factory.getInstance(); 
        //IProducer p = new Producer(); // Upcasting
         p.show();
         p.input();
        //  p.notExpose1();
        //  p.notExpose2();
        //  p.notExpose3();
    }
}
class ConsumerB{
    void call(){
        IProducer p = Factory.getInstance(); 
        //IProducer p = new Producer();
        p.show();
        p.input();
        // p.notExpose1();
        // p.notExpose2();
        // p.notExpose3();
   }
}
public class LoosleyCoupled {
   public static void main(String[] args) {
       ConsumerA c = new ConsumerA();
       c.call();
       System.out.println("************************");
       ConsumerB c2 = new ConsumerB();
       c2.call();
   } 
}
