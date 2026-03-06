package Threads.LambdaExpression.withRunnableInheritence.Oldway;

public class Demo {
    static void main (String args[] ) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My Task 1");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My task 2");
            }
        });
        t1.start();
        t2.start();
    }
}
