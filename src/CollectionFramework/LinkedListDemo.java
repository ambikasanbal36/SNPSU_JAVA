package CollectionFramework;


import java.util.LinkedList;

public class LinkedListDemo {
    static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("start");
        list.addLast("stop");
        System.out.println(list);
    }
}
/**
features
*maintains order of insertion
*allows duplicates
*uses node structure internally-no indexes
 * slower reading but faster insertion and delection compared to array
 **/
