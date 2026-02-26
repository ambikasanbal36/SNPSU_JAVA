package abstraction.Interface.interfaces100_Abstract;
// why interfaces are not 100% abstract!
public interface Demo {
    void show();//Abstract Method!
    default void display(){
        System.out.println("Default Method!");
    }
    static void message(){
        System.out.println("static Method!");
    }
}
class demochild implements Demo{
    @Override
    public void show() {
        System.out.println("demochild");
    }
}

class Driver{
    public static void main(String[] args) {
        Demo.message();
        demochild dc=new demochild();
        dc.display();
        dc.show();
    }
}

