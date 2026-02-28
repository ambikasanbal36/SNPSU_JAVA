package Threads.MainSingleThread;

public class Demo {
    static void main(String[] args) {
        System.out.println("Main Thread Started");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mian Thread:" + 1);
        }
        System.out.println("Main Thread Stopped");
    }
}
