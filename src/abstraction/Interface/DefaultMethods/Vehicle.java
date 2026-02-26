package abstraction.Interface.DefaultMethods;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Vehicle stopped");
    }
}
class audi implements Vehicle{
    @Override
    public void start() {
        System.out.println("audi has started");

    }
}
class BMW implements Vehicle{
    @Override
    public void start() {
        System.out.println("BMW has started");
    }
    public void stop(){
        System.out.println("BMW has stopped");

    }
}
class Rolsroys implements Vehicle{
    @Override
    public void start() {
        System.out.println("Rolroys has started");
    }
}
class Driver{
    public static void main(String[] args) {
        audi a=new audi();
        a.start();
        a.stop();
        BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        Rolsroys rolsroys=new Rolsroys();
        rolsroys.start();
        rolsroys.stop();
    }
}
