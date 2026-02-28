package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4TryWithResources {
    public static void main(String[] args)throws IOException {
        String str;
       try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
           System.out.println("Enter Text:");
           str =br.readLine();
           System.out.println("You Entered:" +str);
       }
    }
}
