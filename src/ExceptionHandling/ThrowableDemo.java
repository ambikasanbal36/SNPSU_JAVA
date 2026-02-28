package ExceptionHandling;

public class ThrowableDemo {
    static void function() throws Throwable {
        throw new Throwable("something went wrong");
    }

    public static void main(String[] args) {
        try{
            function();

        }catch (Throwable t){
            System.out.println(t.getMessage());
        }
    }
}
