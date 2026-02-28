package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class E4 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }
    }
}
