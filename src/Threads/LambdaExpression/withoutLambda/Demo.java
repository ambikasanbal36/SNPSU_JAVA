package Threads.LambdaExpression.withoutLambda;

interface Greeting{
    void sayhello();
}
public class Demo {
    static void main(String[] args) {
        Greeting g=new Greeting (){
            @Override
             public void sayhello() {
                System.out.println("Hello World");
            }
        };
        g.sayhello();
    }
}
