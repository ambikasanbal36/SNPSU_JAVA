package abstraction.static_methods;

abstract class Animal {
        static void run(){
            System.out.println("Animal is sitting");
        }abstract void sound();
    }
    class Lion extends Animal {
        void sound(){
            System.out.println("roars");
        }
    }
    class tiger extends Animal {
        void sound(){
            System.out.println("roars");
        }
    }
    class Driver{
        public static void main(String[] args) {
           Lion l=new Lion();
            l.sound();
           Lion.run();
            tiger t=new tiger();
            t.sound();
            tiger.run();
        }
    }



