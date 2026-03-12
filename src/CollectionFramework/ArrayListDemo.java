package CollectionFramework;


import java.util.ArrayList;

public class ArrayListDemo {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("Array list:" +list);
        System.out.println("Getting element at index 1:" +list.get(1));
        System.out.println("list size:" +list.size());
        System.out.println("list contains 100:" +list.contains(100));
        System.out.println("list remove 30:" +list.remove(2));
        System.out.println("updated Array :" +list);
        for (int i:list){
            System.out.print(i+ " ");
        }
    }
}
/*
features
*maintains order of insertion
*allows duplicates
*Dynamic Size
*Index based access
*Fast
 */
