package abstraction.Interface.DefaultMethods.HowtoAccess;

public interface Vehicle {
    default void start(){
        System.out.println("Vehicle started");
    }
}
class car implements Vehicle{
    @Override
    public void start() {
        System.out.println("car has started");
    }
}
class Driver{
    static void main(String[] args) {
        car c=new car();
        c.start();
    }
}
