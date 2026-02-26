package abstraction.Interface.demo;

abstract class Animal {
    abstract void sound();
    void run(){
        System.out.println("Running");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("roars");
    }
}
class tiger extends Animal{
    void sound(){
        System.out.println("roars");
    }
}
class Driver{
    public static void main(String[] args) {
       Lion l=new Lion();
       l.sound();
       l.run();
       tiger t=new tiger();
       t.sound();
       t.run();
    }
}

