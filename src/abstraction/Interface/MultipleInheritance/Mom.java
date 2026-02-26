package abstraction.Interface.MultipleInheritance;

public interface Mom {
    default void cook(){
        System.out.println("Indian");

    }
}
interface Dad {
    default void cook() {
        System.out.println("Chiness");
    }
}
class Child implements Mom,Dad{
    @Override
    public void cook() {
        System.out.println("Italian");
        Dad.super.cook();
        Mom.super.cook();
    }
}
class Driver{
    static void main(String[] args) {
       Child c=new Child();
       c.cook();
    }
}
