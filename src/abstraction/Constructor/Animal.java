package abstraction.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");

    }
    abstract void sound();
}
class Lion extends Animal{
    Lion(){
        System.out.println("Lion Constructor");
    }

    @Override
    void sound() {

    }
}
class Tiger extends Animal{
    Tiger(){
        System.out.println("Tiger Constructor");
    }

    @Override
    void sound() {

    }
}
class Driver{
    public static void main(String[] args){
        Lion l=new Lion();
        l.sound();
        Tiger t=new Tiger();
        t.sound();

    }
}
