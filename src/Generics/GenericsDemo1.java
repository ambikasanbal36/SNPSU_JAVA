package Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add(10);
        list.add(1.5);
       // String str=(String)
        System.out.println(list);
    }
}
