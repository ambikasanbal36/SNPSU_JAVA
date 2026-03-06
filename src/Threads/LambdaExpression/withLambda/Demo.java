package Threads.LambdaExpression.withLambda;

interface Greeting{
    void sayhello();
}
public class Demo {
    static void main(String[] args) {
          Greeting g= () ->{ //lambda function usage (syntax)
                System.out.println("Hello World");
        }; // semicolon mandatory
        g.sayhello();
    }
}
// we can use lambda func with the interface which as only abstract method